package com.elora.module.conhecimento.repository;
<<<<<<< HEAD

import com.elora.module.conhecimento.entity.CategoriaConteudo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaConteudoRepository extends JpaRepository<CategoriaConteudo, Integer> {
}
=======
import com.elora.module.conhecimento.entity.CategoriaConteudo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface CategoriaConteudoRepository extends JpaRepository<CategoriaConteudo, Integer> {
    Optional<CategoriaConteudo> findByNome(String nome);
}
>>>>>>> upstream/testes
