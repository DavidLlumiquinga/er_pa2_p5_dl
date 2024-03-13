package er_pa2_p4_dl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import er_pa2_p4_dl.repository.IEstudianteRepository;
import er_pa2_p4_dl.repository.modelo.Estudiante;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository iEstudianteRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.ingresar(estudiante);
	}


	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.encontrarPorCedula(cedula);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepository.seleccionar(id);
	}


	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepository.actualizar(estudiante);
	}

}
