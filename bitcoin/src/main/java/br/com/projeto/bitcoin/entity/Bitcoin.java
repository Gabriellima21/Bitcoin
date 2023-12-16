package br.com.projeto.bitcoin.entity;

import java.math.BigInteger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_bitcoin")
public class Bitcoin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "endereco", length = 42, nullable = false,unique = true)
	private String endereco;
	@Column(name = "saldo", nullable = false)
	private BigInteger saldo;
	@Column(name = "taxa_tx", nullable = false)
	private BigInteger taxaTX;
	@ManyToOne
	@JoinColumn(name = "saldo_detalhado", nullable = false)
	private SaldoDetalhado saldoDetalhado;
	@ManyToOne
	@JoinColumn(name = "total", nullable = false)
	private Total total;
	
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
