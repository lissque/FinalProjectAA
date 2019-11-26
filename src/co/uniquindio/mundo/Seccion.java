package co.uniquindio.mundo;

public class Seccion {
	
	private Escenario escenario;
	private Puesto puestos [][];
	private String nombre;
	
	public Seccion() {}
	
	public Seccion(int n, String nombre) {
		escenario = new Escenario();
		puestos = new Puesto [n][n];
		this.nombre = nombre;
	}

	public Escenario getEscenario() {
		return escenario;
	}

	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
	}

	public Puesto[][] getPuestos() {
		return puestos;
	}

	public void setPuestos(Puesto[][] puestos) {
		this.puestos = puestos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
