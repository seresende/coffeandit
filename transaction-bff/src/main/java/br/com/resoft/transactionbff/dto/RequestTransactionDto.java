package br.com.resoft.transactionbff.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "Objeto de transporte para o envio de uma promessa de transação")
public class RequestTransactionDto extends TransactionDto {

	@JsonIgnore
	private SituacaoEnum situacao;
	@JsonIgnore
	private LocalDateTime data;

}
