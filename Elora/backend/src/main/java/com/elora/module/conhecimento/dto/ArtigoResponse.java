package com.elora.module.conhecimento.dto;
<<<<<<< HEAD

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
=======
import lombok.*;
import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ArtigoResponse {
    private Integer id;
    private String titulo;
    private String corpo;
    private String categoria;
    private Integer categoriaId;
    private Integer autorId;
    private Boolean publicado;
    private LocalDateTime criadoEm;
}
>>>>>>> upstream/testes
