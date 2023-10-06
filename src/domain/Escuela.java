package domain;

import java.util.Arrays;

public class Escuela {

	private static final int CANTIDAD_ASIGNACIONES_DEFAULT = 4;
	private String nombreEscuela;
	private Asignacion[] asignaciones;
	private int cantidadAsignaciones;

	public Escuela() {
		this.asignaciones = new Asignacion[CANTIDAD_ASIGNACIONES_DEFAULT];
		this.cantidadAsignaciones = 0;

	}

	public Escuela(int capacidad, String nombreEscuela) {
		this();
		this.asignaciones = new Asignacion[capacidad];
		this.cantidadAsignaciones = 0;
		this.nombreEscuela = nombreEscuela;
	}

	public void agregarAsignacion(Asignacion asignacion) {

		if (cantidadAsignaciones < asignaciones.length) {
			asignaciones[cantidadAsignaciones] = asignacion;
			cantidadAsignaciones++;

		} else {
			System.out.println("Nro Asignaciones máxima alcanzada(" + cantidadAsignaciones + ").");
		}
	}

	@Override
	public String toString() {
		return "Escuela: " + nombreEscuela + Arrays.toString(asignaciones);
	}

}
