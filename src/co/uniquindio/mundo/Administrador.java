package co.uniquindio.mundo;

/**
 * @author Luisa Cotte
 * @author Lissette Quebrada
 * @author Andres Cortes 
 */
public class Administrador {
	
	//------------------ ATRIBUTOS -----------------------//
	private String id;
	private String contraseña;

	/**
	 * Constructor de la clase Administrador
	 */
	public Administrador() {
		id = "123";
		contraseña = "123";
	}

	//------------------------GETTERS AND SETTERS---------------------//
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
