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
	private Cliente miCliente;

	// ------------------------GETTERS AND SETTERS---------------------//

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}

	public double getCUPO_DISPONIBLE() {
		return CUPO_DISPONIBLE;
	}
}
