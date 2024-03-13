package er_pa2_p4_dl.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import er_pa2_p4_dl.repository.modelo.Materia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Materia> encontrarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery=this.entityManager.createQuery("select m from Materia m",Materia.class);
		
		return myQuery.getResultList();
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Materia> encontrarPorId(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery=this.entityManager.createQuery("select m from Materia m where m.id=:id",Materia.class);
		myQuery.setParameter(id, "id");
		return myQuery.getResultList();
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Materia encontrarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery=this.entityManager.createQuery("select m from Materia m where m.codigo=:codigo",Materia.class);
		myQuery.setParameter(codigo, "codigo");
		return myQuery.getSingleResult();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(materia);
	}
	
}
