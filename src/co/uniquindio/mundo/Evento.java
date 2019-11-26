package co.uniquindio.mundo;

import java.util.ArrayList;

public class Evento {
	
	private ArrayList<Cliente> misClientes;
	private ArrayList<Registro> misRegistros;
	private ArrayList<Administrador> misUsuarios;
	
	public Evento() {
		misClientes =  new ArrayList<Cliente>();
		misRegistros = new ArrayList<Registro>();
		misUsuarios = new ArrayList<Administrador>();
	}
	
	public void agregarCliente (Cliente miC) {
		misClientes.add(miC);
	}
	
	public void agregarRegistro (Registro miR) {
		misRegistros.add(miR);
	}
	
	public void agregarUsuario (Administrador miU) {
		misUsuarios.add(miU);
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

	public ArrayList<Administrador> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Administrador> misUsuarios) {
		this.misUsuarios = misUsuarios;
	}
	
}
