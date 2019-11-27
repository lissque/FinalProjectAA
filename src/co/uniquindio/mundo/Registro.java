package co.uniquindio.mundo;

import java.util.ArrayList;

public class Registro {
	private ArrayList<Cliente> clientes;
	private ArrayList<Puesto> puestos;
		
	public Registro() {
		clientes = new ArrayList<>();
		puestos = new ArrayList<>();
	}
	
	public void agregarCliente (Cliente mic) {
		clientes.add(mic);
	}
	
	public void agregarPuesto (Puesto miP) {
		puestos.add(miP);
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(ArrayList<Puesto> puestos) {
		this.puestos = puestos;
	}
}
