package co.uniquindio.mundo;

public class Administrador {
	private String id;
	private String contrase�a;
	
	public Administrador (String id, String contrase�a) {
		this.id = id;
		this.contrase�a = contrase�a;
	}
	
	public Administrador () {}

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
