package br.com.projeto.bitcoin.dto;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class SaldoDTO {
	
	private BigInteger saldoConfirmado;
    private BigInteger saldoNaoConfirmado;
    
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
