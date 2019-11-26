package co.uniquindio.mundo;

public class Tarjeta {
	
	private final double CUPO_DISPONIBLE = 2500000;
	private Cliente miCliente;
	
	public Tarjeta() {}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}

	public double getCUPO_DISPONIBLE() {
		return CUPO_DISPONIBLE;
	}
	
}
