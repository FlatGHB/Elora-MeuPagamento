package com.elora.module.conhecimento.entity;
<<<<<<< HEAD

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "faq")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faq { // TODO: originalmente "extends BaseEntity", classe que nao existe no projeto

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_faq")
    private Long idFaq;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String pergunta;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String resposta;

    @Column(length = 100)
    private String categoria;

    @Column(length = 50)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private CategoriaConteudo categoriaConteudo;

    public void cadastrarPergunta() {
        this.status = "RASCUNHO";
    }

    public void atualizarResposta(String r) {
        this.resposta = r;
    }

    public void publicarFaq() {
        this.status = "PUBLICADO";
    }
}
=======
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
@Entity @Table(name = "faq")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Faq {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_faq") private Integer id;
    @Column(nullable = false, columnDefinition = "TEXT") private String pergunta;
    @Column(nullable = false, columnDefinition = "TEXT") private String resposta;
    @Column(length = 100) private String categoria;
    @Column(length = 50) private String status = "rascunho";
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "categoria_id") private CategoriaConteudo categoriaRef;
    @CreationTimestamp @Column(name = "criado_em", updatable = false) private LocalDateTime criadoEm;
    public void cadastrarPergunta() { this.status = "rascunho"; }
    public void atualizarResposta(String r) { this.resposta = r; }
    public void publicarFaq() { this.status = "publicado"; }
}
>>>>>>> upstream/testes
