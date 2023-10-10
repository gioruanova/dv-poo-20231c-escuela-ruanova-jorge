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
	/**
	 * Mejora:<br>
	 * El constructor no debe ser directo y debiera tener un metodo para validar que
	 * la asignacion Alumno/Materia no se repita o tener un diferenciador (ej: ID)
	 * para diferenciar posibles asignacioens repetidas
	 */
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
				System.out.println("\nAsignacion: " + (i + 1) + asignaciones[i]);
			} else {
				System.out.println("\nAsignacion " + (i + 1) + " no creada.");
			}
		}
	}

	/**
	 * 
	 * Se agrega un metodo adicional para tener una vision adicional
	 */
	// Metodo adicional privado resumen aprobaciones
//	private String resumenAprobaciones(String estadoAprobacion) {
//		int aprobados = 0;
//		String listaAprobados = "";
//
//		for (Asignacion asignacion : asignaciones) {
//			if (asignacion != null) {
//				if (asignacion.estadoMateria().equalsIgnoreCase(estadoAprobacion)) {
//					aprobados++;
//					listaAprobados += "-" + asignacion.getAlumno() + ": " + asignacion.getMateria().getNombre()
//							+ "\n Cuatrimestre: " + asignacion.getMateria().getCuatrimestre() + "\n Promedio:  "
//							+ asignacion.promediarNotas().toString().substring(0, 3) + "\n";
//
//				}
//			}
//		}
//		return "\nAlumnos" + " " + estadoAprobacion + "s: " + aprobados + " (%"
//				+ String.format("%.2f", ((double) aprobados / asignaciones.length) * 100.0) + ") " + "\n"
//				+ listaAprobados;
//
//	}

	// Metodo adicional listado aprobados
//	public String resumenAprobados() {
//		return resumenAprobaciones("Aprobado");
//	}

	// Metodo adicional listado reprobados
//	public String resumenReprobados() {
//		return resumenAprobaciones("Reprobado");
//	}

	@Override
	public String toString() {
		return ((nombreEscuela != null) ? "Escuela [nombreEscuela=" + nombreEscuela : "---") + ", asignaciones="
				+ Arrays.toString(asignaciones) + "]";
	}
}
