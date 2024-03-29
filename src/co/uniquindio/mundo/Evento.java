package co.uniquindio.mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Evento
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE S�NCHEZ
 * @author ANDR�S FELIPE CORT�S RODR�GUEZ
 */
public class Evento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// --------------------------------ATRIBUTOS---------------------------//
	private ArrayList<Cliente> misClientes;
	private ArrayList<Registro> misRegistros;
	private Administrador admin;
	private Escenario escenario;

	/**
	 * Constructor de la clase Evento
	 */
	public Evento() {
		misClientes = new ArrayList<Cliente>();
		misRegistros = new ArrayList<Registro>();
		admin = new Administrador();
		escenario = new Escenario();

		Cliente cliente = new Cliente("123", "LU", "COTTE", "CASA", "LU@HOTMAIL.COM", null, 1, NivelEstudio.BACHILLER,
				EstadoCivil.SOLTERO, Genero.MUJER, null);

//		misClientes.add(0, cliente);

	}

	/**
	 * Metodo para agregar un cliente al arraylist de cliente
	 * 
	 * @param miC
	 *            Cliente que se agregar� al ArrayList de clientes
	 */
	public void agregarCliente(Cliente miC) {
		misClientes.add(miC);
	}
	
	/**
	 * Metodo para agregar un registro al arraylist de registro
	 * 
	 * @param miR
	 *            Registro que se agregar� al ArrayList de registro
	 */
	public void agregarRegistro(Registro miR) {
		misRegistros.add(miR);
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

	public ArrayList<Registro> getMisRegistros() {
		return misRegistros;
	}

	public void setMisRegistros(ArrayList<Registro> misRegistros) {
		this.misRegistros = misRegistros;
	}
	public int getposCliente(String id)
	{
		int pos = -1;
		int cont = 0;
		for (Cliente cliente : misClientes) {
			if(cliente.getId().equals(id))
			{
				return cont;
			}
			cont++;
		}
		return pos;
	}
	public Cliente getCliente(String id)
	{
		int pos = getposCliente(id);
		if(pos!=-1)
		{
			Cliente miCliente = getMisClientes().get(pos);
			return miCliente;
		}
		return null;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
}
