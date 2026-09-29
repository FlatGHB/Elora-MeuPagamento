package com.elora.module.conhecimento.service;

import com.elora.common.exception.ForbiddenException;
import com.elora.module.conhecimento.dto.ArtigoRequest;
import com.elora.module.conhecimento.dto.ArtigoResponse;
import com.elora.module.conhecimento.repository.CategoriaConteudoRepository;
import com.elora.module.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConhecimentoService {

    private final UsuarioService usuarioService;
    private final CategoriaConteudoRepository categorias;

    public ArtigoResponse criar(ArtigoRequest req, Integer autorId) {
        if (!usuarioService.ehStaff(autorId)) {
            throw new ForbiddenException("Apenas equipe");
        }
        var cat = req.getCategoriaId() != null
                ? categorias.findById(req.getCategoriaId()).orElseThrow()
                : null;
        // TODO: salvar o artigo (usando "cat") e converter para ArtigoResponse
        throw new UnsupportedOperationException("Criacao de artigo ainda nao implementada");
    }

    public List<ArtigoResponse> listarPublicados() {
        // TODO: buscar os artigos publicados no repositorio
        return List.of();
    }
}
