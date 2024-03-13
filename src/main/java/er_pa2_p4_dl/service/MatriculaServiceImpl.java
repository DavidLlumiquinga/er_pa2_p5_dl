package er_pa2_p4_dl.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import er_pa2_p4_dl.dto.MatriculaDTO;
import er_pa2_p4_dl.repository.IMatriculaRepository;
import er_pa2_p4_dl.repository.modelo.Estudiante;
import er_pa2_p4_dl.repository.modelo.Materia;
import er_pa2_p4_dl.repository.modelo.Matricula;
import jakarta.transaction.Transactional;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Autowired
	private IMateriaService iMateriaService;
	@Autowired
	private IEstudianteService iEstudianteService;

	@Override
	@Transactional
	public void guardar(Matricula matricula) {
		this.iMatriculaRepository.ingresar(matricula);
	}
	
	@Override
	@Transactional
	public void guardarDTO(MatriculaDTO matriculaDTO) {

		Materia materia = this.iMateriaService.buscarPorCodigo(matriculaDTO.getCodigoMateria());
		Estudiante estudiante = this.iEstudianteService.buscarPorCedula(matriculaDTO.getCedulaEstudiante());

		Matricula matricula = new Matricula();
		matricula.setEstudiante(estudiante);
		matricula.setMateria(materia);
		matricula.setFechaMatricula(LocalDateTime.now());
		if (materia.getNumEstudiantes() == null) {
			materia.setNumEstudiantes(1);
		} else {
			Integer estu = materia.getNumEstudiantes() + 1;

			materia.setNumEstudiantes(estu);
		}
		estudiante.getMatriculas().add(matricula);
		materia.getMatriculas().add(matricula);

		this.guardar(matricula);
		this.iEstudianteService.actualizar(estudiante);
		this.iMateriaService.actualizar(materia);

	}
	

	@Override
	public List<MatriculaDTO> buscarListaDto() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.encontrarListaDto();
	}

}
