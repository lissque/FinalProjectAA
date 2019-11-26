package co.uniquindio.mundo;

public class Administrador {
	private String id;
	private String contraseña;
	
	public Administrador (String id, String contraseña) {
		this.id = id;
		this.contraseña = contraseña;
	}
	
	public Administrador () {}

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
