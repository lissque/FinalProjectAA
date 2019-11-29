package co.uniquindio.mundo;

import java.io.Serializable;

/**
 * Clase enum para Las respuestas a la encuesta
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE S�NCHEZ
 * @author ANDR�S FELIPE CORT�S RODR�GUEZ
 *
 */

public enum Respuesta implements Serializable{

	MUY_DE_ACUERDO("MUY DE ACUERDO"), ALGO_DE_ACUERDO("ALGO DE ACUERDO"), NI_DE_ACUERDO_NI_DESACUERDO(
			"NI DE ACUERDO, NI DESACUERDO"), ALGO_EN_DESACUERDO(
					"ALGO EN DESACUERDO"), MUY_EN_DESACUERDO("MUY EN DESACUERDO");

	private String nombre;

	private Respuesta(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
