package er_pa2_p4_dl.repository;

import java.util.List;

import er_pa2_p4_dl.repository.modelo.Materia;

public interface IMateriaRepository {

    public void insertar(Materia materia);
    public List<Materia> encontrarTodos();
    public List<Materia> encontrarPorId(Integer id);
    public Materia encontrarPorCodigo(String codigo);
    public void actualizar(Materia materia);
}
