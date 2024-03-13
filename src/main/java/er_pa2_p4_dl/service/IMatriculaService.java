package er_pa2_p4_dl.service;

import java.util.List;

import er_pa2_p4_dl.dto.MatriculaDTO;
import er_pa2_p4_dl.repository.modelo.Matricula;

public interface IMatriculaService {
	public void guardar(Matricula matricula);

	public void guardarDTO(MatriculaDTO matriculaDTO);

	public List<MatriculaDTO> buscarListaDto();
}
