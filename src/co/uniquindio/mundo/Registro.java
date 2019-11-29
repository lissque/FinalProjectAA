package co.uniquindio.mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase registro
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Registro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ------------------------------------ATRIBUTOS--------------------------------//
	private Cliente cliente;
	private ArrayList<Puesto> puestos;

	/**
	 * Constructor de la clase Registro
	 */
	public Registro(Cliente cliente) {
		this.cliente=cliente;
		puestos = new ArrayList<Puesto>();
	}

	/**
	 * Metodo para agregar un cliente al array list
	 * 
	 * @param mic
	 *            Cliente que se agregará al ArrayList de clientes
	 */
	public void agregar(Puesto miP) {
		puestos.add(miP);
	}

	// -------------------------GETTERS AND SETTERS------------------------//
	
	public ArrayList<Puesto> getRegistros() {
		return puestos;
	}

	public void setRegistros(ArrayList<Puesto> puestos) {
		this.puestos = puestos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Puesto> getPuestos() {
		return puestos;
	}

	public void setPuestos(ArrayList<Puesto> puestos) {
		this.puestos = puestos;
	}

	
}
