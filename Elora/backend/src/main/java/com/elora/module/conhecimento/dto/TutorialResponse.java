package com.elora.module.conhecimento.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TutorialResponse {

    private Long idTutorial;
    private String titulo;
    private String descricao;
    private String linkConteudo;
    private String status;
    private Integer categoriaId;
}
