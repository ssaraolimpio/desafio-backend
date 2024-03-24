package desafio.picpay.sistematransacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.picpay.sistematransacao.dto.TransacaoRequestDTO;
import desafio.picpay.sistematransacao.model.Transacao;
import desafio.picpay.sistematransacao.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
	
	@Autowired
	private TransacaoService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Transacao> criarTransacao(@RequestBody TransacaoRequestDTO transacao) throws Exception{
		var novaTransacao = service.criarTransacao(transacao);
		return new ResponseEntity<>(novaTransacao, HttpStatus.CREATED);
	}
	
	@GetMapping("/consultar")
	public ResponseEntity<List<Transacao>> consultarUsuario(){
		var transacao = service.consultarTransacao();
		return new ResponseEntity<>(transacao, HttpStatus.OK);
	}
//	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<Object> handleException(Exception e) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno ao processar a solicitação.");
//	}
}
