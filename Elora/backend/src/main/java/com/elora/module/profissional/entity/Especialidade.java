package com.elora.module.profissional.entity;
<<<<<<< HEAD
import jakarta.persistence.*; import lombok.Data;
@Entity(name = "ProfissionalEspecialidade")
@Table(name = "especialidade")
@Data
=======
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="especialidade") @Data @NoArgsConstructor @AllArgsConstructor
>>>>>>> upstream/testes
public class Especialidade { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_especialidade") private Integer id; @Column(unique=true,nullable=false) private String nome; }