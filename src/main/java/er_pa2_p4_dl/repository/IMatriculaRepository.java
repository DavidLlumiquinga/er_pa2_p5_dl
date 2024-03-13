package er_pa2_p4_dl.repository;

import java.util.List;

import er_pa2_p4_dl.dto.MatriculaDTO;
import er_pa2_p4_dl.repository.modelo.Matricula;

public interface IMatriculaRepository {

	public void ingresar(Matricula matricula);
	public List<MatriculaDTO> encontrarListaDto();
}
