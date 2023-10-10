package domain;

public class Materia {

	// ATRIBUTOS-------------------------------------------
	private String nombre;
	private String cuatrimestre;

	public Materia(String nombre, String cuatrimestre) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCuatrimestre() {
		return cuatrimestre;
	}

	@Override
	public String toString() {
		return nombre + "\nCuatrimestre: " + cuatrimestre;
	}
}
