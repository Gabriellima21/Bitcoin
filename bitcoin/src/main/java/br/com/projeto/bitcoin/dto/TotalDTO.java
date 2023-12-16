package br.com.projeto.bitcoin.dto;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class TotalDTO {
	
	 private BigInteger enviado;
	 private BigInteger recebido;
	 
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
