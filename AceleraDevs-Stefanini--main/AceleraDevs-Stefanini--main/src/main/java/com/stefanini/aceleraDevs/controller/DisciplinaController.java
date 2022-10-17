package com.stefanini.aceleraDevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stefanini.aceleraDevs.dto.AlunoDTO;
import com.stefanini.aceleraDevs.dto.DisciplinaDTO;
import com.stefanini.aceleraDevs.exception.CursoNotFoundException;
import com.stefanini.aceleraDevs.exception.TurmaNotFoundException;
import com.stefanini.aceleraDevs.mapper.DisciplinaDTOService;
import com.stefanini.aceleraDevs.model.Disciplina;
import com.stefanini.aceleraDevs.service.DisciplinaService;

@Controller
public class DisciplinaController {

    private final DisciplinaService disciplinaService;
    private final DisciplinaDTOService disciplinaDTOService;

    @Autowired
    public DisciplinaController(DisciplinaService disciplinaService, DisciplinaDTOService disciplinaDTOService) {
        this.disciplinaService = disciplinaService;
        this.disciplinaDTOService = disciplinaDTOService;
    }

    @Autowired


    @RequestMapping(path = "/disciplina")
    public ModelAndView loadHtml() {

        ModelAndView mv = new ModelAndView("disciplina");
        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        mv.addObject("disciplinaDTO", disciplinaDTO);

        return mv;
    }

    @PostMapping(value = "/disciplina")
    public String saveDisciplina(DisciplinaDTO disciplina) throws TurmaNotFoundException, CursoNotFoundException {

        Disciplina newDisciplina = disciplinaDTOService.mapDisciplina(disciplina);
        disciplinaService.save(newDisciplina);
        return "redirect:/disciplina";
    }
    
    @RequestMapping(value = "/disciplinaEditar")
    public String editeDisciplina(AlunoDTO disciplina) throws TurmaNotFoundException{
    	
    	Disciplina editeDisciplina = disciplinaDTOService.mapDisciplina(disciplina);
    	disciplinaService.edite(editeDisciplina);
    	return "redirect:/disciplina";
    }
    
    @RequestMapping(value = "/disciplinaExcluir")
    public String removeDisciplina(AlunoDTO disciplina) throws TurmaNotFoundException{
    	
    	Disciplina removeDisciplina = disciplinaDTOService.mapDisciplina(disciplina);
    	disciplinaService.remove(removeDisciplina);
    	return "redirect:/disciplina";
    }
}
