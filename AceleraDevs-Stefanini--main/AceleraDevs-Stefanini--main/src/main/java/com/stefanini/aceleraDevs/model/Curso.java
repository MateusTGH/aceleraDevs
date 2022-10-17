package com.stefanini.aceleraDevs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas;

    private Integer totalGrade;

    public Curso(Long id, String name, List<Disciplina> disciplinas, Integer totalGrade) {
        this.id = id;
        this.setName(name);
        this.disciplinas = disciplinas;
        this.setTotalGrade(totalGrade);
    }

	public Integer getTotalGrade() {
		return totalGrade;
	}

	public void setTotalGrade(Integer totalGrade) {
		this.totalGrade = totalGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
