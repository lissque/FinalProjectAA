package co.uniquindio.mundo;

import java.io.Serializable;

/**
 * Clase Administrador
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Administrador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ------------------ ATRIBUTOS -----------------------//
	private String id;
	private String contraseña;

	/**
	 * Constructor de la clase Administrador
	 */
	public Administrador() {
		id = "123";
		contraseña = "123";
	}

	// ------------------------GETTERS AND SETTERS---------------------//
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
