package co.uniquindio.mundo;

/**
 * @author Luisa Cotte
 * @author Lissette Quebrada
 * @author Andres Cortes 
 */
public class Administrador {
	
	//------------------ ATRIBUTOS -----------------------//
	private String id;
	private String contrase�a;

	/**
	 * Constructor de la clase Administrador
	 */
	public Administrador() {
		id = "123";
		contrase�a = "123";
	}

	//------------------------GETTERS AND SETTERS---------------------//
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
