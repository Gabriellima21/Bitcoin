package br.com.projeto.bitcoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.projeto.bitcoin.dto.SaldoDTO;
import br.com.projeto.bitcoin.entity.Bitcoin;
import br.com.projeto.bitcoin.entity.SaldoDetalhado;

@Repository
public interface BitcoinRepository extends JpaRepository<Bitcoin, Integer>{
	
	List<Bitcoin> findByEnderecoLike(String endereco);
	List<Bitcoin> findUtxoByEnderecoLike(String endereco);
	
	@Query("SELECT b.saldoConfirmado, b.saldoNaoConfirmado FROM Bitcoin b WHERE b.endereco = :endereco")
    SaldoDTO findSaldoByEndereco(String endereco);
}
