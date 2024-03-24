package desafio.picpay.sistematransacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.picpay.sistematransacao.dto.UsuarioRequestDTO;
import desafio.picpay.sistematransacao.model.Usuario;
import desafio.picpay.sistematransacao.repository.UsuarioRepository;
import desafio.picpay.sistematransacao.util.TipoUsuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario criarUsuario(UsuarioRequestDTO usuario) {
		Usuario novoUsuario = new Usuario(usuario);
		salvarUsuario(novoUsuario);
		return novoUsuario;
	}

	public void salvarUsuario(Usuario usuario) {
		repository.save(usuario);		
	}
	
	public List<Usuario> consultarUsuario(){
		return repository.findAll();
	}
	
	public Usuario consultarIdUsuario(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado."));
	}
	
	public boolean validarUsuario(Usuario pagador, double valor) throws Exception{
		if (pagador.getTipoUsuario() == TipoUsuario.LOJISTA) {
			throw new Exception("Um usuário lojista não pode realizar transações.");
		}
		if (pagador.getSaldo() < valor || pagador.getSaldo() < 0) {
			throw new Exception("Saldo insuficiente para realizar transferência.");
		}
		return true;
	}
}
