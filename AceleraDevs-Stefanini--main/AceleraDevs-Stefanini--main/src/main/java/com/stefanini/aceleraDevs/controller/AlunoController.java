package com.stefanini.aceleraDevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stefanini.aceleraDevs.dto.AlunoDTO;
import com.stefanini.aceleraDevs.exception.TurmaNotFoundException;
import com.stefanini.aceleraDevs.mapper.AlunoDTOService;
import com.stefanini.aceleraDevs.model.Aluno;
import com.stefanini.aceleraDevs.service.AlunoService;

@Controller
public class AlunoController {

    private final AlunoService alunoService;
    private final AlunoDTOService alunoDTOService;

    @Autowired
    public AlunoController(AlunoService alunoService, AlunoDTOService alunoDTOService) {
        this.alunoService = alunoService;
        this.alunoDTOService = alunoDTOService;
    }

    @Autowired


    @RequestMapping(path = "/aluno")
    public ModelAndView loadHtml() {

        ModelAndView mv = new ModelAndView("aluno");
        AlunoDTO alunoDTO = new AlunoDTO();

        mv.addObject("alunoDTO", alunoDTO);

        return mv;
    }

    @PostMapping(value = "/aluno")
    public String saveAluno(AlunoDTO aluno) throws TurmaNotFoundException {

        Aluno newAluno = alunoDTOService.mapAluno(aluno);

        alunoService.save(newAluno);

        return "redirect:/aluno";
    }
    
    @RequestMapping(value = "/alunoEditar")
    public String editeAluno(AlunoDTO aluno) throws TurmaNotFoundException{
    	
    	Aluno editeAluno = alunoDTOService.mapAluno(aluno);
    	alunoService.remove(editeAluno);
    	return "redirect:/curso";
    }
    
    @RequestMapping(value = "/alunoExcluir")
    public String removeAluno(AlunoDTO aluno) throws TurmaNotFoundException{
    	
    	Aluno removeAluno = alunoDTOService.mapAluno(aluno);
    	alunoService.remove(removeAluno);
    	return "redirect:/curso";
    }

}
