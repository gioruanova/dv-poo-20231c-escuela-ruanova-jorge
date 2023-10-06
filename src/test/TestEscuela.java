package test;

import domain.Alumno;
import domain.Asignacion;
import domain.Materia;
import domain.Escuela;

public class TestEscuela {

	public static void main(String[] args) {

		Escuela escuela = new Escuela(9, "Escuela DaVinci");

		Materia materia1 = new Materia("JAVA POO", "1");
		Materia materia2 = new Materia("UX", "1");
		Materia materia3 = new Materia("PHP", "2");

		Alumno alumno1 = new Alumno("Juan", 20);
		Alumno alumno2 = new Alumno("Jorge", 36);
		Alumno alumno3 = new Alumno("Luis", 34);

		Asignacion asignacion1 = new Asignacion(materia1, alumno1, 5.0, 5.0, 5.0);
		Asignacion asignacion2 = new Asignacion(materia2, alumno1, 7.5, 8.0, 9.0);
		Asignacion asignacion3 = new Asignacion(materia3, alumno1, 6.0, 7.0, 8.0);

		Asignacion asignacion4 = new Asignacion(materia1, alumno2, 6.0, 7.0, 8.0);
		Asignacion asignacion5 = new Asignacion(materia2, alumno2, 6.0, 7.0, 8.0);
		Asignacion asignacion6 = new Asignacion(materia3, alumno2, 6.0, 7.0, 8.0);

		Asignacion asignacion7 = new Asignacion(materia1, alumno3, 3.0, 2.0, 4.0);
		Asignacion asignacion8 = new Asignacion(materia2, alumno3, 4.0, 3.0, 1.0);
		Asignacion asignacion9 = new Asignacion(materia3, alumno3, 6.0, 7.0, 8.0);

		escuela.agregarAsignacion(asignacion1);
		escuela.agregarAsignacion(asignacion2);
		escuela.agregarAsignacion(asignacion3);
		escuela.agregarAsignacion(asignacion4);
		escuela.agregarAsignacion(asignacion5);
		escuela.agregarAsignacion(asignacion6);
		escuela.agregarAsignacion(asignacion7);
		escuela.agregarAsignacion(asignacion8);
		escuela.agregarAsignacion(asignacion9);

		System.out.println(escuela.toString());

	}

}
