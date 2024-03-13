package er_pa2_p4_dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import er_pa2_p4_dl.repository.IMateriaRepository;
import er_pa2_p4_dl.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.insertar(materia);
	}

	@Override
	public List<Materia> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.encontrarTodos();
	}

	@Override
	public List<Materia> buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.encontrarPorId(id);
	}

	@Override
	public Materia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.encontrarPorCodigo(codigo);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.actualizar(materia);
	}
}
