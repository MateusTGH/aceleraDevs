package com.stefanini.aceleraDevs.mapper;

import org.springframework.stereotype.Service;

import com.stefanini.aceleraDevs.dto.TurmaDTO;
import com.stefanini.aceleraDevs.model.Turma;

@Service
public class TurmaDTOService {

     public Turma mapTurma(TurmaDTO turma){

        Turma newTurma = new Turma(null, turma.getNome(), null, null);
        return newTurma;
    }
}
