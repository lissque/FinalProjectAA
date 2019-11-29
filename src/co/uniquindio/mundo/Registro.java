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
	private ArrayList<Registro> registros;

	/**
	 * Constructor de la clase Registro
	 */
	public Registro() {
		registros = new ArrayList<Registro>();
	}

	/**
	 * Metodo para agregar un cliente al array list
	 * 
	 * @param mic
	 *            Cliente que se agregará al ArrayList de clientes
	 */
	public void agregarRegistro(Registro miR) {
		registros.add(miR);
	}

	// -------------------------GETTERS AND SETTERS------------------------//
	
	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}

	
}
