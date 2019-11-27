package co.uniquindio.mundo;

public class Fecha {
	private String año, mes, dia;

	public Fecha() {
	}

	public Fecha(String año, String mes, String dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
