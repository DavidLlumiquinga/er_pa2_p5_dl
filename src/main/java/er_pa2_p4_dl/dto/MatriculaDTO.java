package er_pa2_p4_dl.dto;

public class MatriculaDTO {

	private String cedulaEstudiante;
	private String apellidoEstudiante;
	private String nombreMateria;
	private String codigoMateria;
	private String fechaMatricula;

	public MatriculaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatriculaDTO(String cedulaEstudiante, String apellidoEstudiante, String nombreMateria, String codigoMateria,
			String fechaMatricula) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.apellidoEstudiante = apellidoEstudiante;
		this.nombreMateria = nombreMateria;
		this.codigoMateria = codigoMateria;
		this.fechaMatricula = fechaMatricula;
	}

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [cedulaEstudiante=" + cedulaEstudiante + ", apellidoEstudiante=" + apellidoEstudiante
				+ ", nombreMateria=" + nombreMateria + ", codigoMateria=" + codigoMateria + ", fechaMatricula="
				+ fechaMatricula + "]";
	}

}
