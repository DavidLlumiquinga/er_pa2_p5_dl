package er_pa2_p4_dl.service;

import java.util.List;

import er_pa2_p4_dl.repository.modelo.Materia;

public interface IMateriaService {
    public void guardar(Materia materia);
    public List<Materia> buscarTodos();
    public List<Materia> buscarPorId(Integer id);
    public Materia buscarPorCodigo(String codigo);
    public void actualizar(Materia materia);
}
