package domain;

import java.util.Arrays;

public class Asignacion {
	private Materia materia;
	private Alumno alumno;
	private double primerParcial;
	private double segundoParcial;
	private double trabajoPractico;

	public Asignacion(Materia materia, Alumno alumno, double primerParcial, double segundoParcial,
			double trabajoPractico) {
		this.materia = materia;
		this.alumno = alumno;
		this.primerParcial = primerParcial;
		this.segundoParcial = segundoParcial;
		this.trabajoPractico = trabajoPractico;
	
	}

	public Materia getMateria() {
		return materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public double promediarNotas() {
		return (primerParcial + segundoParcial + trabajoPractico) / 3.0;
	}

	public double getPrimerParcial() {
		return primerParcial;
	}

	public void setPrimerParcial(double primerParcial) {
		this.primerParcial = primerParcial;
	}

	public double getSegundoParcial() {
		return segundoParcial;
	}

	public void setSegundoParcial(double segundoParcial) {
		this.segundoParcial = segundoParcial;
	}

	public double getTrabajoPractico() {
		return trabajoPractico;
	}

	public void setTrabajoPractico(double trabajoPractico) {
		this.trabajoPractico = trabajoPractico;
	}

	public String estadoMateria() {
		double promedio = promediarNotas();
		return promedio >= 6.0 ? "Aprobado" : "Reprobadod";
	}

	public String mostrarAlumno() {
		return alumno.getNombre();
	}

	@Override
	public String toString() {
		return "\n" + "\n" + "Asignacion: " + "\nAlumno: " + alumno + "\nMateria: " + materia + "\nNotas: "
				+ getPrimerParcial() + " - " + getSegundoParcial() + " - " + getTrabajoPractico() + "\nPromedio: "
				+ promediarNotas() + "\nEstado: " + estadoMateria();
	}

}
