package com.stefanini.aceleraDevs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stefanini.aceleraDevs.exception.CursoNotFoundException;
import com.stefanini.aceleraDevs.model.Curso;
import com.stefanini.aceleraDevs.repository.CursoRepository;

@Service

public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> findAllCursos(){
        return cursoRepository.findAll();
    }

    public Curso findById(Long id) throws CursoNotFoundException {
        return cursoRepository.findById(id)
                .orElseThrow(()-> new CursoNotFoundException(id));
    }

    public Curso save(Curso curso){
        return cursoRepository.save(curso);
    }
    
    public void remove(Curso curso){
        cursoRepository.delete(curso);
		
    }
    
    public Curso edite(Curso curso){
        cursoRepository.modifica(curso);
		return curso;
		
    }
}
