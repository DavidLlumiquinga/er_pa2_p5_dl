package er_pa2_p4_dl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import er_pa2_p4_dl.repository.modelo.Materia;
import er_pa2_p4_dl.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	@Autowired
	private IMateriaService materiaService;

	@GetMapping("/insertar")
	public String nuevoMateria(Materia materia) {
		return "vistaMateria";
	}

	@PostMapping("/guardar")
	public String guardarMateria(Materia materia) {
		this.materiaService.guardar(materia);
		return "redirect:/materias/insertar";
	}
}
