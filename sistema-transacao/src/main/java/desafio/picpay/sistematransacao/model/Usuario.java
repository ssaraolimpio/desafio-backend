package desafio.picpay.sistematransacao.model;

import desafio.picpay.sistematransacao.dto.UsuarioRequestDTO;
import desafio.picpay.sistematransacao.util.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(unique = true)
	private String cpfCnpj;
	
	@Column(unique = true)
	private String email;
	
	private String senha;
	
    @Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
    
    private double saldo;
    
    public Usuario(UsuarioRequestDTO usuario) {
    	this.nome = usuario.getNome();
    	this.cpfCnpj = usuario.getcpfCnpj();
    	this.email = usuario.getEmail();
    	this.senha = usuario.getSenha();
    	this.tipoUsuario = usuario.getTipoUsuario();
    	this.saldo = usuario.getSaldo();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
