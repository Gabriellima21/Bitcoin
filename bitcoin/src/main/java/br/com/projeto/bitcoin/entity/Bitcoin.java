package br.com.projeto.bitcoin.entity;

import java.math.BigInteger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_bitcoin")
public class Bitcoin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@Column(name = "endereco", length = 42, nullable = false)
	String endereco;
	@Column(name = "saldo", nullable = false)
	BigInteger saldo;
	@Column(name = "taxa_tx", nullable = false)
	BigInteger taxaTX;
	@ManyToOne
	@JoinColumn(name = "saldo_confirmado", nullable = false)
	SaldoDetalhado saldoConfirmado;
	@ManyToOne
	@JoinColumn(name = "saldo_nao_confirmado", nullable = false)
	SaldoDetalhado saldoNaoConfirmado;
	@ManyToOne
	@JoinColumn(name = "total_enviado", nullable = false)
	Total totalEnviado;
	@ManyToOne
	@JoinColumn(name = "total_recebido", nullable = false)
	Total totalRecebido;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public SaldoDetalhado getSaldoConfirmado() {
		return saldoConfirmado;
	}
	public void setSaldoConfirmado(SaldoDetalhado saldoConfirmado) {
		this.saldoConfirmado = saldoConfirmado;
	}
	public SaldoDetalhado getSaldoNaoConfirmado() {
		return saldoNaoConfirmado;
	}
	public void setSaldoNaoConfirmado(SaldoDetalhado saldoNaoConfirmado) {
		this.saldoNaoConfirmado = saldoNaoConfirmado;
	}
	public Total getTotalEnviado() {
		return totalEnviado;
	}
	public void setTotalEnviado(Total totalEnviado) {
		this.totalEnviado = totalEnviado;
	}
	public Total getTotalRecebido() {
		return totalRecebido;
	}
	public void setTotalRecebido(Total totalRecebido) {
		this.totalRecebido = totalRecebido;
	}
}
