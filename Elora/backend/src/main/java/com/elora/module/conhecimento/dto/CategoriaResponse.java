package com.elora.module.conhecimento.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaResponse {

    private Integer idCategoria;
    private String nomeCategoria;
    private String descricao;
    private LocalDateTime createdAt;
}
