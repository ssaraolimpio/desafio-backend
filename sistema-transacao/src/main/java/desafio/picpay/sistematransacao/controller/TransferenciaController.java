package desafio.picpay.sistematransacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.picpay.sistematransacao.dto.TransferenciaRequestDTO;

@RestController
@RequestMapping("/transacao")
public class TransferenciaController {
	
	@PostMapping("/transferencia")
	public ResponseEntity<String> criarTransacao(@RequestBody TransferenciaRequestDTO request) {
	
		
		
	return null;
		
	}
	
}
