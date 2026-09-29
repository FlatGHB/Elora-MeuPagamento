package com.elora.module.profissional.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario_especialidade")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(UsuarioEspecialidadeID.class)
public class UsuarioEspecialidade {
    @Id
    @Column(name = "usuario_id")
    private Integer usuarioId;

    @Id
    @Column(name = "especialidade_id")
    private Integer especialidadeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "especialidade_id", insertable = false, updatable = false)
    private Especialidade especialidade;
}

class UsuarioEspecialidadeID implements Serializable {
    private Integer usuarioId;
    private Integer especialidadeId;

    public UsuarioEspecialidadeID() {
    }

    public UsuarioEspecialidadeID(Integer usuarioId, Integer especialidadeId) {
        this.usuarioId = usuarioId;
        this.especialidadeId = especialidadeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEspecialidadeID)) return false;
        UsuarioEspecialidadeID that = (UsuarioEspecialidadeID) o;
        return java.util.Objects.equals(usuarioId, that.usuarioId)
                && java.util.Objects.equals(especialidadeId, that.especialidadeId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(usuarioId, especialidadeId);
    }
}