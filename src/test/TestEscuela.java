
package test;

import domain.Alumno;
import domain.Asignacion;
import domain.Materia;
import domain.Nota;
import domain.Escuela;

/**
 * @MEJORAS En caso de no querer utilizar la condicion y metodoligia del
 *          atributo validadorNotas, se debiera definir el comportamiento de:
 *          <br>
 *          1. Notas = null 2.<br>
 *          2. Notas no creadas<br>
 *          <br>
 * 
 * 
 *          De esto dependera si el usuario puede seguir operando y el calculo
 *          promedio/estado materia. <br>
 *          <br>
 *          Actualmente:<br>
 *          Nota ignresada = 0 > SI se considerara para el promedio<br>
 *          Nota ingresada = null > NO se considerara para el promedio<br>
 *          Nota no generada > NO se considerara para el promedio<br>
 *          <br>
 * 
 *          En base a estas definiciones, se procederia a refactorizar el codigo
 *          para aumentar la eficacia del programa y sus calculos.
 */
public class TestEscuela {

	public static void main(String[] args) {

		Escuela escuela1 = new Escuela("Escuela DaVinci");
		Materia materia1 = new Materia("JAVA POO", "1");
		Materia materia2 = new Materia("UX", "1");
		Materia materia3 = new Materia("PHP", "2");

		// Alumnos
		Alumno alumno1 = new Alumno("Juan", 20);
		Alumno alumno2 = new Alumno("Jorge", 36);
		Alumno alumno3 = new Alumno("Luis", 25);

//		ASIGNACIONES----------------------------------------

		// Asignacion Alumno 1
		// Materia 1
		Asignacion asignacion1 = new Asignacion(materia1, alumno1);
		Nota[] notasAlumno1Materia1 = { new Nota(5.5, "Parcial uno"), new Nota(8.5, "Parcial dos"),
				new Nota(9.0, "TP") };

		asignacion1.asignarNotas(notasAlumno1Materia1);
		escuela1.agregarAsignacion(asignacion1);

		// Materia 2
		Asignacion asignacion2 = new Asignacion(materia2, alumno1);
		Nota[] notasAlumno1Materia3 = { new Nota(4.0, "Parcial uno"), new Nota(7.0, "Parcial dos"),
				new Nota(6.0, "TP") };

		asignacion2.asignarNotas(notasAlumno1Materia3);
		escuela1.agregarAsignacion(asignacion2);

		// --------------------------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------------------------

		// Asignacion Alumno 2
		// Materia 1
		Asignacion asignacion3 = new Asignacion(materia2, alumno2);
		Nota[] notasAlumno2Materia1 = { new Nota(6.5, "Parcial uno"), new Nota(7.0, "Parcial dos"),
				new Nota(5.5, "TP") };

		asignacion3.asignarNotas(notasAlumno2Materia1);
		escuela1.agregarAsignacion(asignacion3);

		// Materia 2
		Asignacion asignacion4 = new Asignacion(materia3, alumno2);
		Nota[] notasAlumno2Materia2 = { new Nota(4.0, "Parcial uno"), new Nota(9.0, "Parcial dos"),
				new Nota(6.0, "TP") };

		asignacion4.asignarNotas(notasAlumno2Materia2);
		escuela1.agregarAsignacion(asignacion4);

		// --------------------------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------------------------

		// Asignacion Alumno 3 - CON TESTEOS DE NOTAS VACIAS
		// Materia 1
		Asignacion asignacion5 = new Asignacion(materia1, alumno3);
		Nota[] notasAlumno3Materia1 = { new Nota(6.0, "Parcial uno"), new Nota(9.0, "Parcial dos"),
				new Nota(9.0, "TP") };

		asignacion5.asignarNotas(notasAlumno3Materia1);
		escuela1.agregarAsignacion(asignacion5);

		// Materia 2
		Asignacion asignacion6 = new Asignacion(materia3, alumno3);
		Nota[] notasAlumno3Materia2 = { new Nota(6.6, "Parcial uno"), new Nota(6.0, "Parcial dos"),
				new Nota(0.0, "TP") };

		asignacion6.asignarNotas(notasAlumno3Materia2);
		escuela1.agregarAsignacion(asignacion6);

		// --------------------------------------------------------------------------------------------------------------
		// DETALLE ASIGNACIONES ESCUELA 1
		escuela1.mostrarAsignaciones();

		// Metodo adicional Escuela
//		System.out.println(escuela1.resumenAprobados());
//		System.out.println(escuela1.resumenReprobados());

	}
}
