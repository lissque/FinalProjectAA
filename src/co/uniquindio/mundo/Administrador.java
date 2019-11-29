package co.uniquindio.mundo;

import java.io.Serializable;

/**
 * Clase Administrador
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE S�NCHEZ
 * @author ANDR�S FELIPE CORT�S RODR�GUEZ
 */
public class Administrador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ------------------ ATRIBUTOS -----------------------//
	private String id;
	private String contrase�a;

	/**
	 * Constructor de la clase Administrador
	 */
	public Administrador() {
		id = "123";
		contrase�a = "123";
	}

	// ------------------------GETTERS AND SETTERS---------------------//
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
