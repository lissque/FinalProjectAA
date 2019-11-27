package co.uniquindio.mundo;

import java.util.ArrayList;

public class Evento {

	private ArrayList<Cliente> misClientes;
	private Registro registro;
	private Administrador admin;
	private Escenario escenario;

	public Evento() {
		misClientes = new ArrayList<Cliente>();
		registro = new Registro();
		admin = new Administrador();
		escenario = new Escenario();
	}

	public Escenario getEscenario() {
		return escenario;
	}

	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
	}

	public void agregarCliente(Cliente miC) {
		misClientes.add(miC);
	}

	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
}
