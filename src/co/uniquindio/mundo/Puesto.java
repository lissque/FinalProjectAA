package co.uniquindio.mundo;

public class Puesto {
	
	private EstadoPuesto estado;
	private Cliente cliente;
	private Seccion seccion;
	
	public Puesto() {
		estado = EstadoPuesto.LIBRE;
		cliente = new Cliente();
		seccion = new Seccion();
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

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}
	
	
}
