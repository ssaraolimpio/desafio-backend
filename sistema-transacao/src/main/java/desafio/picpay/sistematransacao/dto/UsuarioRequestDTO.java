package desafio.picpay.sistematransacao.dto;

import desafio.picpay.sistematransacao.util.TipoUsuario;

public class UsuarioRequestDTO {

	private String nome;
	private String cpfCnpj;
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcpfCnpj() {
		return cpfCnpj;
	}
	public void setcpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
