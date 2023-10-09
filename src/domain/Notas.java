package domain;

public class Notas {
	private Double valorNota;
	private String tipoNota;

	public Notas(Double valorNota, String tipoNota) {
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
