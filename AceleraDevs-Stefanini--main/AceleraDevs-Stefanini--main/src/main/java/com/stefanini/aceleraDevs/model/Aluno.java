package com.stefanini.aceleraDevs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String matricula;

    @OneToOne
    private DadosPessoais dadosPessoais;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Aluno(Long id, String nome, String matricula, DadosPessoais dadosPessoais, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dadosPessoais = dadosPessoais;
        this.turma = turma;
    }
}
