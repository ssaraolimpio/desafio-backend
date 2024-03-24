package desafio.picpay.sistematransacao.service;

import org.springframework.stereotype.Service;

import desafio.picpay.sistematransacao.model.Usuario;

@Service
public class NotificacaoService {

	public void enviarNotificacao(Usuario usuario, String mensagem) {
		
		String email = usuario.getEmail();
		System.out.println(email + mensagem);
	}
	
}
