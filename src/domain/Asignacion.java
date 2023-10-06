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

	public double getPromedio() {
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

	public String getEstado() {
		double promedio = getPromedio();
		return promedio >= 6.0 ? "Aprobado" : "Reprobadod";
	}

	@Override
	public String toString() {
		return "Asignacion [materia=" + materia + ", alumno=" + alumno + ", primerParcial=" + primerParcial
				+ ", segundoParcial=" + segundoParcial + ", trabajoPractico=" + trabajoPractico + "]";
	}

}
