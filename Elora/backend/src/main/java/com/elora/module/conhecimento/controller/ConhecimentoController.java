package com.elora.module.conhecimento.controller;

import com.elora.common.dto.ApiResponse;
import com.elora.security.SecurityUtils;
import com.elora.module.conhecimento.dto.ArtigoRequest;
import com.elora.module.conhecimento.dto.ArtigoResponse;
import com.elora.module.conhecimento.service.ConhecimentoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conhecimento")
@RequiredArgsConstructor
public class ConhecimentoController {

    private final ConhecimentoService service;

    @GetMapping("/artigos")
    public ApiResponse<List<ArtigoResponse>> listar() {
        return ApiResponse.ok(service.listarPublicados());
    }

    @GetMapping("/artigos/{id}")
    public ApiResponse<ArtigoResponse> get(@PathVariable Long id) {
        // TODO: implementar busca por id
        return null;
    }

    @PostMapping("/artigos")
    public ApiResponse<ArtigoResponse> criar(@Valid @RequestBody ArtigoRequest req, Authentication auth) {
        return ApiResponse.ok(service.criar(req, SecurityUtils.currentUserId(auth)));
    }
}
