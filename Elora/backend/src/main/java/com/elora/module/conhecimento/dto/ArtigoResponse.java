package com.elora.module.conhecimento.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArtigoResponse {

    private Long idArtigo;
    private String titulo;
    private String conteudo;
    private String categoria;
    private LocalDate dataPublicacao;
    private Integer categoriaId;
}
