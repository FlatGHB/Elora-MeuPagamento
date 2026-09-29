package com.elora.module.profissional.repository;
import com.elora.module.profissional.entity.UsuarioEspecialidade;
import com.elora.module.profissional.entity.UsuarioEspecialidadeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
<<<<<<< HEAD:Elora/backend/src/main/java/com/elora/module/profissional/repository/ProfissionalUsuarioEspecialidadeRepository.java
public interface ProfissionalUsuarioEspecialidadeRepository
        extends JpaRepository<UsuarioEspecialidade, Integer> {
=======
public interface UsuarioEspecialidadeRepository extends JpaRepository<UsuarioEspecialidade, UsuarioEspecialidadeId> {
>>>>>>> upstream/testes:Elora/backend/src/main/java/com/elora/module/profissional/repository/UsuarioEspecialidadeRepository.java
    void deleteByUsuarioId(Integer usuarioId);
    @Query("SELECT e.nome FROM ProfissionalUsuarioEspecialidade ue JOIN ue.especialidade e WHERE ue.usuarioId = :uid ORDER BY e.nome")
    List<String> findNomesByUsuarioId(Integer uid);
}