package desafio.picpay.sistematransacao.dto;

public class TransacaoRequestDTO {

	private double valor;
	private Long idPagador;
	private Long idRecebedor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long getIdPagador() {
		return idPagador;
	}
	public void setIdPagador(Long idPagador) {
		this.idPagador = idPagador;
	}
	public Long getIdRecebedor() {
		return idRecebedor;
	}
	public void setIdRecebedor(Long idRecebedor) {
		this.idRecebedor = idRecebedor;
	}
	
	
}
