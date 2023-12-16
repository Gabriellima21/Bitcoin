package br.com.projeto.bitcoin.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.bitcoin.dto.BitcoinDTO;
import br.com.projeto.bitcoin.dto.SaldoDTO;
import br.com.projeto.bitcoin.service.BitcoinService;

@RestController
@RequestMapping(path = "api/v2")
public class BitcoinController {
	
	@Autowired
	BitcoinService bitcoinService;
	
	@GetMapping("/details/{address}")
	public BitcoinDTO findByEnderecoLike(@PathVariable String address) {
		return bitcoinService.findByEnderecoLike(address);
	}
	
	@GetMapping("/balance/{address}")
    public SaldoDTO findSaldoByEndereco (@PathVariable String address) {
        return bitcoinService.findBySaldoDetalhadoEndereco(address);
    }
}
