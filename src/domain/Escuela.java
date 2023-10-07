package domain;

import java.util.Arrays;

/**
 * @MEJORAS Se creó el atributo nombre para el objeto escuela
 */
public class Escuela {

	// ATRIBUTOS-------------------------------------------
	private static final int CANTIDAD_ASIGNACIONES_DEFAULT = 6;

	private String nombreEscuela;
	private Asignacion[] asignaciones;

	// Constructor con cantidad estatica y sin nombre
	public Escuela(String nombreEscuela) {
		this.asignaciones = new Asignacion[CANTIDAD_ASIGNACIONES_DEFAULT];
		this.nombreEscuela = nombreEscuela;
	}

	// Constructor con cantidad variable
	public Escuela(int capacidad, String nombreEscuela) {
		this.asignaciones = new Asignacion[capacidad];
		this.nombreEscuela = nombreEscuela;
	}

	// METODOS-------------------------------------------
	// Agregar asignacion
	public void agregarAsignacion(Asignacion asignacion) {
		int i = 0;
		while (i < asignaciones.length) {
			if (this.asignaciones[i] == null) {
				this.asignaciones[i] = asignacion;
				break;
			}
			i++;
		}
		if (i >= asignaciones.length) {
			System.out.println("Maximo de asignaciones alcanzadas");
		}
	}

	// Mostrar asignaciones
	public void mostrarAsignaciones() {
		System.out.println(nombreEscuela);
		for (int i = 0; i < asignaciones.length; i++) {
			if (asignaciones[i] != null) {
				System.out.println(asignaciones[i]);
			} else {
				System.out.println("\nAsignacion " + (i + 1) + " no creada.");
			}
		}
	}

	@Override
	public String toString() {
		return ((nombreEscuela != null) ? "Escuela [nombreEscuela=" + nombreEscuela : "---") + ", asignaciones="
				+ Arrays.toString(asignaciones) + "]";
	}
}
