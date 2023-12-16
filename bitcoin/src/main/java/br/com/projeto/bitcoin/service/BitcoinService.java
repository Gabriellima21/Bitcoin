package br.com.projeto.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.bitcoin.dto.BitcoinDTO;
import br.com.projeto.bitcoin.dto.SaldoDTO;
import br.com.projeto.bitcoin.entity.Bitcoin;
import br.com.projeto.bitcoin.entity.SaldoDetalhado;
import br.com.projeto.bitcoin.entity.Total;
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
   
	
	public BitcoinDTO findByEnderecoLike(String address) {
		if(address == null || address.isBlank()) {
			throw new BitcoinException(ENDERECO_BITCOIN_NAO_INFORMADO);
		}
		Bitcoin bitcoin = bitcoinRepository.findByEnderecoLike(address);
		BitcoinDTO bitcoinDTO = new BitcoinDTO();
		SaldoDTO s = new SaldoDTO();
		Total t = new Total();
		
		bitcoinDTO.setEndereco(bitcoin.getEndereco());
		bitcoinDTO.setSaldo(bitcoin.getSaldo());
		bitcoinDTO.setTaxaTX(bitcoin.getTaxaTX());
		//s.setSaldoConfirmado(bitcoin.getSaldoDetalhado().getSaldoConfirmado());
		//s.setSaldoNaoConfirmado(bitcoin.getSaldoDetalhado().getSaldoNaoConfirmado());
		bitcoinDTO.setSaldoDetalhado(bitcoin.getSaldoDetalhado());
		bitcoinDTO.setTotal(bitcoin.getTotal());
		
		return bitcoinDTO;
	}
	
	/*public SaldoDTO findSaldoByEndereco (String endereco) {
		return bitcoinRepository. findSaldoByEndereco(endereco);
	}*/
	
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
