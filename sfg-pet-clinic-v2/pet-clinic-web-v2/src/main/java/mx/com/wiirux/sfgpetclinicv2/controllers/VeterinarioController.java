package mx.com.wiirux.sfgpetclinicv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.wiirux.sfgpetclinicv2.services.VeterinarioService;

@Controller
public class VeterinarioController {
	private final VeterinarioService vs;
	
	public VeterinarioController(VeterinarioService vs) {
		this.vs = vs;
	}
	
	@RequestMapping({"/veterinarios","/veterinarios/index","/veterinarios/index.html"})
	public String listaVeterinarios(Model m) {
		
		m.addAttribute("veterinarios", vs.findAll());
		
		return "veterinarios/index";
	}
}
