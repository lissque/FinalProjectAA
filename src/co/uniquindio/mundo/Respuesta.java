package co.uniquindio.mundo;

public enum Respuesta {	
	
	MUY_DE_ACUERDO("MUY DE ACUERDO"),
	ALGO_DE_ACUERDO("ALGO DE ACUERDO"),
	NI_DE_ACUERDO_NI_DESACUERDO("NI DE ACUERDO, NI DESACUERDO"),
	ALGO_EN_DESACUERDO("ALGO EN DESACUERDO"),
	MUY_EN_DESACUERDO("MUY EN DESACUERDO");
	
	private String nombre;

	private Respuesta(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
