package py.edu.facitec.sptaller4.antonia.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.sptaller4.antonia.dao.comentarioDao;
import py.edu.sptaller4.antonia.model.Comentario;


@Transactional
@Controller
public class ComentarioController {
	
	@Autowired
	private comentarioDao comentarioDao;
	
	public String save(Comentario comentario){
		
		comentarioDao.save(comentario);
		return "ok";
	}
	@RequestMapping ("comentarios/formulario")
	public String formulario(){
		return "/comentarios/formulario";
	}

}
