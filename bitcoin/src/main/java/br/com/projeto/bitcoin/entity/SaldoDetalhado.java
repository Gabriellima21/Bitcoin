package br.com.projeto.bitcoin.entity;


import java.math.BigInteger; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SaldoDetalhado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@Column(name = "confirmado",nullable = false)
	BigInteger saldoConfirmado;
	@Column(name = "naoConfirmado",nullable = false)
    BigInteger saldoNaoConfirmado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigInteger getSaldoConfirmado() {
		return saldoConfirmado;
	}
	public void setSaldoConfirmado(BigInteger saldoConfirmado) {
		this.saldoConfirmado = saldoConfirmado;
	}
	public BigInteger getSaldoNaoConfirmado() {
		return saldoNaoConfirmado;
	}
	public void setSaldoNaoConfirmado(BigInteger saldoNaoConfirmado) {
		this.saldoNaoConfirmado = saldoNaoConfirmado;
	}
}
