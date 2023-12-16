package br.com.projeto.bitcoin.dto;

import java.math.BigInteger;
import org.springframework.stereotype.Component;
import br.com.projeto.bitcoin.entity.SaldoDetalhado;
import br.com.projeto.bitcoin.entity.Total;

@Component
public class BitcoinDTO {
	
	private String endereco;
	private BigInteger saldo;
	private BigInteger taxaTX;
	private SaldoDetalhado saldoDetalhado;
	private Total total;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public BigInteger getSaldo() {
		return saldo;
	}
	public void setSaldo(BigInteger saldo) {
		this.saldo = saldo;
	}
	public BigInteger getTaxaTX() {
		return taxaTX;
	}
	public void setTaxaTX(BigInteger taxaTX) {
		this.taxaTX = taxaTX;
	}
	public SaldoDetalhado getSaldoDetalhado() {
		return saldoDetalhado;
	}
	public void setSaldoDetalhado(SaldoDetalhado saldoDetalhado) {
		this.saldoDetalhado = saldoDetalhado;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
}
