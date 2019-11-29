package co.uniquindio.mundo;

import java.util.ArrayList;

/**
 * Clase registro
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE S�NCHEZ
 * @author ANDR�S FELIPE CORT�S RODR�GUEZ
 */
public class Registro {

	// ------------------------------------ATRIBUTOS--------------------------------//
	private ArrayList<Cliente> clientes;
	private ArrayList<Puesto> puestos;

	/**
	 * Constructor de la clase Registro
	 */
	public Registro() {
		clientes = new ArrayList<>();
		puestos = new ArrayList<>();
	}

	/**
	 * Metodo para agregar un cliente al array list
	 * 
	 * @param mic
	 *            Cliente que se agregar� al ArrayList de clientes
	 */
	public void agregarCliente(Cliente mic) {
		clientes.add(mic);
	}

	/**
	 * Metodo para agregar un puesto al array list de puesto
	 * 
	 * @param miP
	 *            Puesto que se agregar� al ArrayList de puestos
	 */
	public void agregarPuesto(Puesto miP) {
		puestos.add(miP);
	}

	// -------------------------GETTERS AND SETTERS------------------------//

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
