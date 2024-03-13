package er_pa2_p4_dl.repository;

import er_pa2_p4_dl.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public void ingresar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante seleccionar(Integer id);
	public Estudiante encontrarPorCedula(String cedula);
}
