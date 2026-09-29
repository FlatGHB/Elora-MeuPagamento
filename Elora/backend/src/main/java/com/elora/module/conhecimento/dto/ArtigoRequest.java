package com.elora.module.conhecimento.dto;
<<<<<<< HEAD

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
=======
import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ArtigoRequest {
    @NotBlank private String titulo;
    @NotBlank private String corpo;
    private String categoria;
    private Integer categoriaId;
    private Boolean publicado;
}
>>>>>>> upstream/testes
