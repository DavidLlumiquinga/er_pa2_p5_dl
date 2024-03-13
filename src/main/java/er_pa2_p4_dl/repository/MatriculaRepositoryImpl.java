package er_pa2_p4_dl.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import er_pa2_p4_dl.dto.MatriculaDTO;
import er_pa2_p4_dl.repository.modelo.Matricula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> encontrarListaDto() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDTO> myQuery=this.entityManager.createQuery("select new er_pa2_p4_dl.dto.MatriculaDTO(m.estudiante.cedula , m.estudiante.apellido, m.materia.nombre, m.materia.codigo, m.fecha) from Matricula m",MatriculaDTO.class);
		return myQuery.getResultList();
	}

}
