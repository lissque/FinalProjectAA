package co.uniquindio.mundo;

/**
 * Clase Puesto
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Puesto {

	// ------------------------ATRIBUTOS-------------------------//
	private EstadoPuesto estado;
	private Cliente cliente;
	private TipoSeccion seccion;
	private int i;
	private int j;

	/**
	 * Constructor de la clase Puesto
	 * 
	 * @param i
	 *            Para dar numeración al puesto
	 * @param j
	 *            Para dar numeración al puesto
	 */
	public Puesto(int i, int j) {
		estado = EstadoPuesto.LIBRE;
		cliente = new Cliente();
		seccion = null;
		this.i = i;
		this.j = j;
	}

	// --------------------GETTERS AND SETTERS-------------------------//

	public EstadoPuesto getEstado() {
		return estado;
	}

	public void setEstado(EstadoPuesto estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoSeccion getSeccion() {
		return seccion;
	}

	public void setTipoSeccion(TipoSeccion seccion) {
		this.seccion = seccion;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void setSeccion(TipoSeccion seccion) {
		this.seccion = seccion;
	}

}
