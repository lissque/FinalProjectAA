package co.uniquindio.mundo;

import java.util.ArrayList;

/**
 * @author Luisa Cotte
 * @author Lissette Quebrada
 * @author Andres Cortes
 */
public class Evento {

	//--------------------------------ATRIBUTOS---------------------------//
	private ArrayList<Cliente> misClientes;
	private Registro registro;
	private Administrador admin;
	private Escenario escenario;

	/**
	 * Constructor de la clase Evento
	 */
	public Evento() {
		misClientes = new ArrayList<Cliente>();
		registro = new Registro();
		admin = new Administrador();
		escenario = new Escenario();
	}
	
	/**
	 * Metodo para agregar un cliente al arraylist de cliente
	 * @param miC
	 */
	public void agregarCliente(Cliente miC) {
		misClientes.add(miC);
	}

	//--------------------GETTERS AND SETTERS--------------------//
	public Escenario getEscenario() {
		return escenario;
	}

	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
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
