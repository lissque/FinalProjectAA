package co.uniquindio.mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Evento
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Evento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// --------------------------------ATRIBUTOS---------------------------//
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

		Cliente cliente = new Cliente("123", "LU", "COTTE", "CASA", "LU@HOTMAIL.COM", null, 1, NivelEstudio.BACHILLER,
				EstadoCivil.SOLTERO, Genero.MUJER, null);

		misClientes.add(cliente);

	}

	/**
	 * Metodo para agregar un cliente al arraylist de cliente
	 * 
	 * @param miC
	 *            Cliente que se agregará al ArrayList de clientes
	 */
	public void agregarCliente(Cliente miC) {
		misClientes.add(miC);
	}

	// --------------------GETTERS AND SETTERS--------------------//
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
