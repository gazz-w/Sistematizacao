package com.sistematizacao.sistema.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadoresDtoWithoutId (		
	
		@NotBlank String cpf,
		@NotBlank String nome,
		@NotNull Integer capacidadeDoVeiculo) {
			
}