package com.stefanini.aceleraDevs.mapper;

import org.springframework.stereotype.Service;

import com.stefanini.aceleraDevs.dto.CursoDTO;
import com.stefanini.aceleraDevs.exception.TurmaNotFoundException;
import com.stefanini.aceleraDevs.model.Curso;

@Service
public class CursoDTOService {

     public Curso mapCurso(CursoDTO curso) throws TurmaNotFoundException {

        Curso newCurso = new Curso(null, curso.getName(), null, curso.getTotalGrade());
        return newCurso;
    }
     
     
}
