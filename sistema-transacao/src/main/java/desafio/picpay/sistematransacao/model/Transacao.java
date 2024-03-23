package desafio.picpay.sistematransacao.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "transacao")
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "id_pagador")
	private Usuario pagador;
	
	@ManyToOne
	@JoinColumn(name = "id_recebedor")
	private Usuario recebedor;
	
	private LocalDateTime horaTransacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Usuario getPagador() {
		return pagador;
	}

	public void setPagador(Usuario pagador) {
		this.pagador = pagador;
	}

	public Usuario getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(Usuario recebedor) {
		this.recebedor = recebedor;
	}

	public LocalDateTime getHoraTransacao() {
		return horaTransacao;
	}

	public void setHoraTransacao(LocalDateTime horaTransacao) {
		this.horaTransacao = horaTransacao;
	}

	
}
