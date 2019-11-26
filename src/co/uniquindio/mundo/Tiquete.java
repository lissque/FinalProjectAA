package co.uniquindio.mundo;

public class Tiquete {
	
	private Cliente miCliente;
	private TipoSeccion seccion;
	private char fila;
	private int asiento;
	private double precio;
	
	public Tiquete(Cliente miCliente, TipoSeccion seccion, char fila, int asiento, double precio) {
		super();
		this.miCliente = miCliente;
		this.seccion = seccion;
		this.fila = fila;
		this.asiento = asiento;
		this.precio = precio;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}

	public TipoSeccion getSeccion() {
		return seccion;
	}

	public void setSeccion(TipoSeccion seccion) {
		this.seccion = seccion;
	}

	public char getFila() {
		return fila;
	}

	public void setFila(char fila) {
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
