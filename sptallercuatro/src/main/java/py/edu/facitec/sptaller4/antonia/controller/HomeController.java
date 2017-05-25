package py.edu.facitec.sptaller4.antonia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
@RequestMapping("/")
	public String index(){
	
	System.out.println("cargando la pagina de bienvenida");
		return "hello'world";
		
	}
}
