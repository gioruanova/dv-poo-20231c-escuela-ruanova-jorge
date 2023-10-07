package domain;

/**
 * @MEJORAS De no contar con una definicion en notas sobre la "no creacion" de
 *          la misma, o valores "null", es necesario proporcionar informacion
 *          adicional sobre la manera en que esta calculado el promedio<br>
 *          <br>
 *          Interrogantes:<br>
 *          ¿son los nulls contemplados como "0" para el promedio?<br>
 *          ¿la no creacion de una nota, cuenta como "0"/"ausente" y debe
 *          contemplarse su valor para el promedio?<br>
 *          <br>
 *          Escenario alternativo:<br>
 *          ¿debe detenerse el programa ante un ingreso "null" o la NO creacion
 *          de notas? <br>
 *          <br>
 *          Mejora recomendada:<br>
 *          Creacion de un atributo validadorNotas para trabajar en conjunto con
 *          CANTIDAD_NOTAS y mediante condiciones, informar al usuario si la
 *          totalidad de las notas fueron cargadas o no, permitiendolo
 *          continuar, pero de manera informada<br>
 * 
 */

public class Asignacion {

	// ATRIBUTOS-------------------------------------------
	private static final int CANTIDAD_NOTAS = 3;
	private Materia materia;
	private Alumno alumno;
	private Notas[] notas;
	// Atributo adicional para mejorar programa
	// private String validadorNotas = "";

	public Asignacion(Materia materia, Alumno alumno) {
		this.materia = materia;
		this.alumno = alumno;
		this.notas = new Notas[CANTIDAD_NOTAS];
	}

	// METODOS-------------------------------------------
	// Asignar notas a materia
	public void asginarNotas(Notas[] notas) {

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] != null) {
				this.notas[i] = notas[i];
			} else {
				this.notas[i] = null;

			}
		}
	}

	// Calcular promedio
	/**
	 * Condicion en Else comentado basado en recomendacion previamente informada
	 */

	public Double promediarNotas() {
		Double suma = 0.0;
		int contadorNotasValidas = 0;

		for (Notas nota : notas) {
			if (nota != null && nota.getValorNota() != null) {
				suma += nota.getValorNota();
				contadorNotasValidas++;
			}
			// Condicion validadora adicional para mejorar programa
			// else {
			// validadorNotas = "Observaciones: Hay 1 o varias notas incompletas (null o no
			// creadas)";
			// }
		}

		if (contadorNotasValidas == 0) {
			return null;
		}

		return suma / contadorNotasValidas;
	}

	// Estado materia
	public String estadoMateria(Notas[] notas) {
		Double promedio = promediarNotas();
		if (promedio == null) {
			return "Notas no disponibles";
		} else {
			return promedio >= 6.0 ? "APROBADO" : "REPROBADO";
		}
	}

	// Mostrar notas
	public String mostrarNotas() {
		String notasString = "";
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] != null) {
				notasString += notas[i] + " | ";
			}
		}
		return notasString;
	}

	@Override
	public String toString() {
		return "\n" + "Asignacion: " + "\nAlumno: " + alumno + "\nMateria: " + materia + "\nNotas: " + mostrarNotas()
				+ "\nPromedio: " + ((promediarNotas() != null) ? promediarNotas() : "-") + "\nEstado: "
				+ estadoMateria(notas);
	}

//	Metodo con mejora de validacion agregada
//	@Override
//	public String toString() {
//		return "\n" + "Asignacion: " + "\nAlumno: " + alumno + "\nMateria: " + materia + "\nNotas: " + mostrarNotas()
//		+ "\nPromedio: " + ((promediarNotas() != null) ? promediarNotas() : "-") + "\nEstado: "
//		+ estadoMateria(notas) + "\n" + validadorNotas;
//	}

}
