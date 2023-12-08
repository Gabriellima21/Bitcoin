package br.com.projeto.bitcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.bitcoin.entity.SaldoDetalhado;

@Repository
public interface SaldoRepository extends JpaRepository<SaldoDetalhado,Integer>{

}
