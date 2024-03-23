package desafio.picpay.sistematransacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.picpay.sistematransacao.dto.UsuarioRequestDTO;
import desafio.picpay.sistematransacao.model.Usuario;
import desafio.picpay.sistematransacao.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioRequestDTO usuario){
		Usuario novoUsuario = service.criarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
	}
	
}
