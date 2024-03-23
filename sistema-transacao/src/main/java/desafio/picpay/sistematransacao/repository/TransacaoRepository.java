package desafio.picpay.sistematransacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.picpay.sistematransacao.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
