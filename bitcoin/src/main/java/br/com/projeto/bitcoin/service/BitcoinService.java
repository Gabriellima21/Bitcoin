package br.com.projeto.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.bitcoin.dto.SaldoDTO;
import br.com.projeto.bitcoin.entity.Bitcoin;
import br.com.projeto.bitcoin.entity.SaldoDetalhado;
import br.com.projeto.bitcoin.exception.BitcoinException;
import br.com.projeto.bitcoin.repository.BitcoinRepository;

@Service
public class BitcoinService {
	
	protected static final String ENDERECO_BITCOIN_NAO_INFORMADO = "O endereço Bitcoin deve ser informado.";
	protected static final String SALDO_BITCOIN_NAO_INFORMADO = "O SaldoDetalhado do endereço Bitcoin deve ser informado.";
	protected static final String SALDO_CONFIRMADO_BITCOIN_NAO_INFORMADO = "O SaldoDetalhado confirmado do endereço Bitcoin deve ser informado.";
	protected static final String SALDO_NAO_CONFIRMADO_BITCOIN_NAO_INFORMADO = "O SaldoDetalhado não confirmado do endereço Bitcoin deve ser informado.";
	protected static final String TAXATX_BITCOIN_NAO_INFORMADA = "O número total de transações associadas a esse endereço Bitcoin deve ser informado.";
	protected static final String TOTAL_ENVIADO_BITCOIN_NAO_INFORMADO = "O total enviado deve ser informado.";
	protected static final String TOTAL_RECEBIDO_BITCOIN_NAO_INFORMADO = "O total recebido deve ser informado.";
	
	@Autowired
	private BitcoinRepository bitcoinRepository;
   
	/*
	public Bitcoin register(Bitcoin bitcoin) {
		bitcoin.setTotalEnviado(total.getEnviado());
		bitcoin.setTotalRecebido(total.getRecebido());                    
		bitcoin.setSaldoConfirmado(saldoDetalhado.getConfirmado());
		bitcoin.setSaldoNaoConfirmado(saldoDetalhado.getNaoConfirmado());
		if(bitcoin.getEndereco() == null || bitcoin.getEndereco().isBlank()) {
			throw new BitcoinException(ENDERECO_BITCOIN_NAO_INFORMADO);
		}else if(bitcoin.getSaldo() == null) {
			throw new BitcoinException(SALDO_BITCOIN_NAO_INFORMADO);
		}else if(bitcoin.getTaxaTX()== null) {
			throw new BitcoinException(TAXATX_BITCOIN_NAO_INFORMADA);
		}else if(bitcoin.getTotalEnviado() == null) {
			throw new BitcoinException(TOTAL_ENVIADO_BITCOIN_NAO_INFORMADO);
		}else if(bitcoin.getTotalRecebido() == null) {
			throw new BitcoinException(TOTAL_RECEBIDO_BITCOIN_NAO_INFORMADO);
		}else if(bitcoin.getSaldoConfirmado() == null) {
			throw new BitcoinException(SALDO_CONFIRMADO_BITCOIN_NAO_INFORMADO);
		}else if(bitcoin.getSaldoNaoConfirmado() == null) {
			throw new BitcoinException(SALDO_NAO_CONFIRMADO_BITCOIN_NAO_INFORMADO);
		}
		return bitcoinRepository.save(bitcoin);
	}*/
	
	public List<Bitcoin> findByAddressLike(String endereco) {
		if(endereco == null || endereco.isBlank()) {
			throw new BitcoinException(ENDERECO_BITCOIN_NAO_INFORMADO);
		}
		return bitcoinRepository.findByEnderecoLike(endereco);
	}
	
	public SaldoDTO findSaldoByEndereco (String endereco) {
		return bitcoinRepository.findSaldoByEndereco(endereco);
	}
	
	/*public SaldoConfirmadoDTO returnSaldoConfirmado(Bitcoin bitcoin) {
		SaldoConfirmadoDTO sc = new SaldoConfirmadoDTO();
		sc.setSaldoConfirmado(bitcoin.getSaldoConfirmado());
		
	}*/
	
	/*public List<BigInteger> calculateBalance(String address) {
        List<Bitcoin> utxoList = bitcoinRepository.findUtxoByEnderecoLike(address);

        BigInteger saldoConfirmado = BigInteger.ZERO; //inicia zarado
        BigInteger saldoNaoConfirmado = BigInteger.ZERO; //inicia zarado

        for () {
        	
        }
          
    }*/
}
