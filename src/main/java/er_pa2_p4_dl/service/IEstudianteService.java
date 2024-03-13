package er_pa2_p4_dl.service;

import er_pa2_p4_dl.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscar(Integer id);
}
