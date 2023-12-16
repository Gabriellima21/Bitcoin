package br.com.projeto.bitcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.projeto.bitcoin.entity.Bitcoin;
 
@Repository
public interface BitcoinRepository extends JpaRepository<Bitcoin, Integer>{
	
	Bitcoin findByEnderecoLike(String address);
	//@Query("SELECT b FROM Bitcoin b WHERE b.saldo_detalhado.endereco LIKE :address")
	//Bitcoin findBySaldoDetalhado(String address);
	
}
