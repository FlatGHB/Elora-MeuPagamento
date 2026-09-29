package com.elora.module.conhecimento.dto;
<<<<<<< HEAD

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
=======
import lombok.*;
import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TutorialResponse {
    private Integer id;
>>>>>>> upstream/testes
    private String titulo;
    private String descricao;
    private String linkConteudo;
    private String status;
    private Integer categoriaId;
<<<<<<< HEAD
}
=======
    private LocalDateTime criadoEm;
}
>>>>>>> upstream/testes
