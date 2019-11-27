package co.uniquindio.mundo;

import java.util.ArrayList;

public class Evento {

	private ArrayList<Cliente> misClientes;
	private ArrayList<Registro> misRegistros;
	private Administrador admin;

	public Evento() {
		misClientes = new ArrayList<Cliente>();
		misRegistros = new ArrayList<Registro>();
		admin = new Administrador();
	}

	public void agregarCliente(Cliente miC) {
		misClientes.add(miC);
	}

	public void agregarRegistro(Registro miR) {
		misRegistros.add(miR);
	}

	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}

	public ArrayList<Registro> getMisRegistros() {
		return misRegistros;
	}

	public void setMisRegistros(ArrayList<Registro> misRegistros) {
		this.misRegistros = misRegistros;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
}
