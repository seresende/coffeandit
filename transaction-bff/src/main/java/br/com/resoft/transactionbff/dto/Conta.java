package br.com.resoft.transactionbff.dto;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Schema(description = "Código da Agência")
    @NotNull(message = "Informar o código da Agência.")
    private Long codigoAgencia;
    @Schema(description = "Código da Conta")
    @NotNull(message = "Informar o código da Conta.")
    private Long codigoConta;


}
