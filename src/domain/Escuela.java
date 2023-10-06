package domain;

import java.util.Arrays;

public class Escuela {
	private Asignacion[] asignaciones;
	private int cantidadAsignaciones;

	public Escuela(int capacidad) {
		asignaciones = new Asignacion[capacidad];
		cantidadAsignaciones = 0;
	}

	public void agregarAsignacion(Asignacion asignacion) {
		if (cantidadAsignaciones < asignaciones.length) {
			asignaciones[cantidadAsignaciones] = asignacion;
			cantidadAsignaciones++;
		} else {
			System.out.println("No se pueden agregar más asignaciones, capacidad máxima alcanzada.");
		}
	}


	
	public void mostrarEstadoAsignaciones() {
		for (int i = 0; i < cantidadAsignaciones; i++) {
			Asignacion asignacion = asignaciones[i];
			System.out.println("Alumno: " + asignacion.getAlumno().getNombre());
			System.out.println("Materia: " + asignacion.getMateria().getNombre());
			System.out.println("Cuatrimestre: " + asignacion.getMateria().getCuatrimestre());
			System.out.println("Parcial 1=" + asignacion.getPrimerParcial() + ", Parcial 2="
					+ asignacion.getSegundoParcial() + ", TP=" + asignacion.getTrabajoPractico());
			System.out.println("Promedio: " + asignacion.getPromedio());
			System.out.println("Estado: " + asignacion.getEstado());
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Escuela [asignaciones=" + Arrays.toString(asignaciones) + ", cantidadAsignaciones="
				+ cantidadAsignaciones + "]";
	}
		

}
