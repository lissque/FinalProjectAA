package co.uniquindio.mundo;

/**
 * Clase tiquete
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */

public class Tiquete {

	// ------------------ ATRIBUTOS -----------------------//

	private Cliente miCliente;
	private TipoSeccion seccion;
	private char fila;
	private int asiento;
	private double precio;

	/**
	 * Constructor de la clase
	 * 
	 * @param miCliente
	 *            El cliente al que pertenece el tiquete
	 * @param seccion
	 *            Sección donde compró el puesto
	 * @param fila
	 *            Fila donde está hubicado el puesto
	 * @param asiento
	 *            Puesto que compró
	 * @param precio
	 *            Precio del puesto
	 */
	public Tiquete(Cliente miCliente, TipoSeccion seccion, char fila, int asiento, double precio) {
		super();
		this.miCliente = miCliente;
		this.seccion = seccion;
		this.fila = fila;
		this.asiento = asiento;
		this.precio = precio;
	}

	// ------------------------GETTERS AND SETTERS---------------------//

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
