package er_pa2_p4_dl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import er_pa2_p4_dl.repository.modelo.Estudiante;
import er_pa2_p4_dl.service.IEstudianteService;

@Controller
@RequestMapping(value = "/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;

	@GetMapping(value = "/insertar")
	public String nuevoEstudiante(Estudiante estudiante) {
		return "vistaMatricula";
	}

	@PostMapping("/guardar")
	public String guardarEstudiante(Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return "redirect:/estudiantes/insertar";
	}
}
