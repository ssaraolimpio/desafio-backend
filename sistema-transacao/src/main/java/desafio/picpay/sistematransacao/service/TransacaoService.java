package desafio.picpay.sistematransacao.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import desafio.picpay.sistematransacao.dto.TransacaoRequestDTO;
import desafio.picpay.sistematransacao.model.Transacao;
import desafio.picpay.sistematransacao.repository.TransacaoRepository;

@Service
public class TransacaoService {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private TransacaoRepository repository;
	
	@Autowired
	private NotificacaoService notificacaoService;
	
	public Transacao criarTransacao(TransacaoRequestDTO transacao) throws Exception {
		
		var pagador = usuarioService.consultarIdUsuario(transacao.getIdPagador());
		var recebedor = usuarioService.consultarIdUsuario(transacao.getIdRecebedor());
		
		usuarioService.validarUsuario(pagador, transacao.getValor());
		
		boolean isAutorizado = autorizarTransacao();
		
		if (!isAutorizado) {
			throw new Exception("Transação nao autorizada.");
		}
		
		Transacao novaTransacao = new Transacao();
		novaTransacao.setValor(transacao.getValor());
		novaTransacao.setPagador(pagador);
		novaTransacao.setRecebedor(recebedor);
		novaTransacao.setHoraTransacao(LocalDateTime.now());
		
		pagador.setSaldo(pagador.getSaldo() - transacao.getValor());
		recebedor.setSaldo(recebedor.getSaldo() + transacao.getValor());
		
		repository.save(novaTransacao);
		usuarioService.salvarUsuario(pagador);
		usuarioService.salvarUsuario(recebedor);
		
		notificacaoService.enviarNotificacao(pagador, "Transação realizada com sucesso.");
		notificacaoService.enviarNotificacao(recebedor, "Transação recebida com sucesso.");
		
		return novaTransacao;
	}
	
	public boolean autorizarTransacao() {
		var response = restTemplate.getForEntity("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc", Map.class);

		if (response.getStatusCode() == HttpStatus.OK) {
			String message = (String) response.getBody().get("message");
			return "Autorizado".equalsIgnoreCase(message);
		} else {
			return false;
		}
	}
	
	public List<Transacao> consultarTransacao(){
		return repository.findAll();
	}
	
}

