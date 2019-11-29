package co.uniquindio.mundo;

import java.io.Serializable;

/**
 * Clase Tarjeta
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Tarjeta implements Serializable{

	// ------------------ ATRIBUTOS -----------------------//

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double CUPO_DISPONIBLE = 2500000;
	private String numero;

	
	public Tarjeta(String numero) {

		this.numero = numero;
	}

	// ------------------------GETTERS AND SETTERS---------------------//

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getCUPO_DISPONIBLE() {
		return CUPO_DISPONIBLE;
	}
}
