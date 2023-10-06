package domain;

import java.util.Arrays;

public class Escuela {

	private static final int CANTIDAD_ASIGNACIONES_DEFAULT = 4;
	private String nombreEscuela;
	private Asignacion[] asignaciones;

	public Escuela() {
		this.asignaciones = new Asignacion[CANTIDAD_ASIGNACIONES_DEFAULT];
	}

	public Escuela(int capacidad, String nombreEscuela) {
		this();
		this.asignaciones = new Asignacion[capacidad];
		this.nombreEscuela = nombreEscuela;
	}

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

	@Override
	public String toString() {
		return "Escuela: " + nombreEscuela + Arrays.toString(asignaciones);
	}

}
