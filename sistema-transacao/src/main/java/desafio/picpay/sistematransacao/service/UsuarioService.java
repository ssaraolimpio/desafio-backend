package desafio.picpay.sistematransacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.picpay.sistematransacao.dto.UsuarioRequestDTO;
import desafio.picpay.sistematransacao.model.Usuario;
import desafio.picpay.sistematransacao.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario criarUsuario(UsuarioRequestDTO usuario) {
		Usuario novoUsuario = new Usuario(usuario);
		salvarUsuario(novoUsuario);
		return novoUsuario;
	}

	private void salvarUsuario(Usuario usuario) {
		repository.save(usuario);		
	}
	
	public List<Usuario> consultarUsuario(){
		return repository.findAll();
	}
	
}
