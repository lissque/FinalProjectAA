package co.uniquindio.mundo;

public class Puesto {
	
	private EstadoPuesto estado;
	private Cliente cliente;
	private TipoSeccion seccion;
	
	public Puesto() {
		estado = EstadoPuesto.LIBRE;
		cliente = new Cliente();
		seccion = null;
	}

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
}
