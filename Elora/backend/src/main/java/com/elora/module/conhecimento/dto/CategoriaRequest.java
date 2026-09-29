package com.elora.module.conhecimento.dto;
<<<<<<< HEAD

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaRequest {

    @NotBlank
    @Size(max = 255)
    private String nomeCategoria;

    private String descricao;
}
=======
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CategoriaRequest {
    @NotBlank @Size(max=80) private String nome;
    private String descricao;
}
>>>>>>> upstream/testes
