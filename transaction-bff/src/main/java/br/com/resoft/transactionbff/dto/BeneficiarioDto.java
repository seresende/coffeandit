package br.com.resoft.transactionbff.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BeneficiarioDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Schema(description = "CPF do Beneficiário")
    @NotNull(message = "Informar o CPF.")
    private Long CPF;
    @NotNull(message = "Informar o código do banco de destino.")
    @Schema(description = "Código do banco destino")
    private Long codigoBanco;
    @NotNull(message = "Informar a agência de destino.")
    @Schema(description = "Agência de destino")
    private String agencia;
    @NotNull(message = "Informar a conta de destino.")
    @Schema(description = "Conta de destino")
    private String conta;
    @NotNull(message = "Informar o nome do Favorecido.")
    @Schema(description = "Nome do Favorecido")
    private String nomeFavorecido;


}
