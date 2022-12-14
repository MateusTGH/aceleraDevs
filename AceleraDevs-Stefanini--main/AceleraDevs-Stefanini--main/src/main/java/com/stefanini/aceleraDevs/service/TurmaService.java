package com.stefanini.aceleraDevs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stefanini.aceleraDevs.exception.TurmaNotFoundException;
import com.stefanini.aceleraDevs.model.Turma;
import com.stefanini.aceleraDevs.repository.TurmaRepository;

@Service

public class TurmaService {

    private final TurmaRepository turmaRepository;

    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public List<Turma> findAllTurmas(){
        return turmaRepository.findAll();
    }

    public Turma findById(Long id) throws TurmaNotFoundException {
        return turmaRepository.findById(id)
                .orElseThrow(()-> new TurmaNotFoundException(id));
    }

    public Turma save(Turma turma){
        return turmaRepository.save(turma);
    }
    
    public void remove(Turma turma){
        turmaRepository.delete(turma);
		
    }
    
    public Turma edite(Turma turma){
        turmaRepository.edite(turma);
		return turma ;
		
    }
}
