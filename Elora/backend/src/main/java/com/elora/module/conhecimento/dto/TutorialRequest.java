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
public class TutorialRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    private String descricao;

    @NotBlank
    private String linkConteudo;

    private String status;

    private Integer categoriaId;
}
=======
import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TutorialRequest {
    @NotBlank private String titulo;
    private String descricao;
    private String linkConteudo;
    private String status;
    private Integer categoriaId;
}
>>>>>>> upstream/testes
