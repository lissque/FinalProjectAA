package co.uniquindio.mundo;

public class Administrador {
	private String id;
	private String contrase�a;

	public Administrador() {
		id = "admin";
		contrase�a = "1234567";
	}

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
