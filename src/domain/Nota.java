package domain;

public class Nota {
	private Double valorNota;
	private String tipoNota;

	public Nota(Double valorNota, String tipoNota) {
		this.valorNota = valorNota;
		this.tipoNota = tipoNota;
	}

	public Double getValorNota() {
		return valorNota;
	}

	@Override
	public String toString() {
		return " " + tipoNota + ": " + valorNota;
	}
}
