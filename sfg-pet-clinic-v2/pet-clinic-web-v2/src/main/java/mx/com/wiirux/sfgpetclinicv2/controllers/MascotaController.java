package mx.com.wiirux.sfgpetclinicv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MascotaController {
	
	@RequestMapping({"/mascotas", "/mascotas/index", "/mascotas/index.html"})
	public String listaMascotas() {
		return "mascotas/index";
	}
}
