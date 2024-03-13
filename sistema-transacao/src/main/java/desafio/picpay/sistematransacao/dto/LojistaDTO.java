package desafio.picpay.sistematransacao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LojistaDTO extends UsuarioDTO {

	private String cnpj;
	
}
