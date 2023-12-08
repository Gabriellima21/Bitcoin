package br.com.projeto.bitcoin.entity;


import java.math.BigInteger;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Total {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	 @Column(name = "enviado",nullable = false)
	 BigInteger enviado;
	 @Column(name = "recebido", nullable = false)
	 BigInteger recebido;
	 
	public BigInteger getEnviado() {
		return enviado;
	}
	public void setEnviado(BigInteger enviado) {
		this.enviado = enviado;
	}
	public BigInteger getRecebido() {
		return recebido;
	}
	public void setRecebido(BigInteger recebido) {
		this.recebido = recebido;
	}
}
