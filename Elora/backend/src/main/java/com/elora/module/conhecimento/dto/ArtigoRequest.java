package com.elora.module.conhecimento.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArtigoRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    private String conteudo;

    private String categoria;

    private Integer categoriaId;
}
