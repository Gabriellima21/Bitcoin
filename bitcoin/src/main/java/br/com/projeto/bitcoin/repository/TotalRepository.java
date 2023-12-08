package br.com.projeto.bitcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projeto.bitcoin.entity.Total;

@Repository
public interface TotalRepository extends JpaRepository<Total,Integer>{

}
