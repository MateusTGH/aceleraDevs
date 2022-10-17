package com.stefanini.aceleraDevs.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.aceleraDevs.dto.AlunoDTO;
import com.stefanini.aceleraDevs.exception.TurmaNotFoundException;
import com.stefanini.aceleraDevs.model.Aluno;
import com.stefanini.aceleraDevs.model.DadosPessoais;
import com.stefanini.aceleraDevs.service.DadosPessoaisService;
import com.stefanini.aceleraDevs.service.TurmaService;

@Service
public class AlunoDTOService {

    private final TurmaService turmaService;
    private final DadosPessoaisService dadosPessoaisService;

    @Autowired
    public AlunoDTOService(TurmaService turmaService, DadosPessoaisService dadosPessoaisService) {
        this.turmaService = turmaService;
        this.dadosPessoaisService = dadosPessoaisService;
    }


    public Aluno mapAluno(AlunoDTO aluno) throws TurmaNotFoundException {

        DadosPessoais dadosPessoais = new DadosPessoais(
                                                    null,
                                                        aluno.getCpf(),
                                                        aluno.getEmail());
        dadosPessoaisService.save(dadosPessoais);

        Aluno newAluno = new Aluno(null,
                                    aluno.getNome(),
                                    aluno.getMatricula(),
                dadosPessoaisService.save(dadosPessoais),
                turmaService.findById(aluno.getIdTurma())
                                    );
        return newAluno;
    }
}
