package com.elora.module.conhecimento.dto;
<<<<<<< HEAD

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
=======
import lombok.*;
import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CategoriaResponse {
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDateTime criadoEm;
}
>>>>>>> upstream/testes
