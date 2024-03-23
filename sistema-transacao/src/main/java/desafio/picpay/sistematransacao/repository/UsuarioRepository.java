package desafio.picpay.sistematransacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.picpay.sistematransacao.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

	
	
}
