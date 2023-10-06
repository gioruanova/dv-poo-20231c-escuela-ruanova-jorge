package test;

import domain.Alumno;
import domain.Asignacion;
import domain.Materia;
import domain.Escuela;

public class TestEscuela {

	public static void main(String[] args) {

		Escuela escuela = new Escuela(6); // Puedes ajustar la capacidad máxima

		// Crear objetos de alumnos, materias y asignaciones
		Alumno alumno1 = new Alumno("Juan", 20);
		Alumno alumno2 = new Alumno("Jorge", 36);

		Materia materia1 = new Materia("JAVA POO", "1er cuatrimestre");
		Materia materia2 = new Materia("UX", "1er cuatrimestre");
		Materia materia3 = new Materia("PHP", "1er cuatrimestre");

		Asignacion asignacion1 = new Asignacion(materia1, alumno1, 5.0, 5.0, 5.0);
		Asignacion asignacion2 = new Asignacion(materia1, alumno2, 7.5, 8.0, 9.0);
		Asignacion asignacion3 = new Asignacion(materia2, alumno1, 6.0, 7.0, 8.0);
		Asignacion asignacion4 = new Asignacion(materia3, alumno1, 6.0, 7.0, 8.0);

		// Agregar asignaciones a la escuela
		System.out.println("-----1------");
		escuela.mostrarEstadoAsignaciones();
		escuela.agregarAsignacion(asignacion1);
		escuela.mostrarEstadoAsignaciones();
		System.out.println("-----2------");
		escuela.agregarAsignacion(asignacion2);
		escuela.mostrarEstadoAsignaciones();
		System.out.println("-----3------");
		escuela.agregarAsignacion(asignacion3);
		escuela.mostrarEstadoAsignaciones();
		System.out.println("-----4------");
		escuela.agregarAsignacion(asignacion4);
		escuela.mostrarEstadoAsignaciones();
		
		System.out.println(escuela.toString());



	}

}
