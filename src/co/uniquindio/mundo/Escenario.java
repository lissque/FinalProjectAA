package co.uniquindio.mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Escenario
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class Escenario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ------------------------ATRIBUTOS-----------------//
	private ArrayList<Seccion> secciones;
	private ArrayList<Puesto> puestosSeleccionados;

	/**
	 * Constructor de la clase Escenario
	 */
	public Escenario() {
		super();
		secciones = new ArrayList<Seccion>();
		puestosSeleccionados = new ArrayList<Puesto>();
		agregarPlatea1();
		agregarSegundo1();
		agregarClubFans();
		agregarSegundo2();
		agregarPlatea2();
	}

	/**
	 * Metodo para agregar la seccion club de fans al escenario
	 */
	public void agregarClubFans() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.CLUB_FANS);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	/**
	 * Metodo para agregar la seccion platea 1 al escenario
	 */
	public void agregarPlatea1() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.PLATEA_1);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	/**
	 * Metodo para agregar la seccion platea 2 al escenario
	 */
	public void agregarPlatea2() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.PLATEA_2);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	/**
	 * Metodo para agregar la seccion el segundo piso 1 al escenario
	 */
	public void agregarSegundo1() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.SEGUNDO_PISO_1);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	/**
	 * Metodo para agregar la seccion el segundo piso 2 al escenario
	 */
	public void agregarSegundo2() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.SEGUNDO_PISO_2);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	/**
	 * Metodo para agregar puestos seleccionados
	 */
	public void agregarPuesto(Puesto puesto) {
		puestosSeleccionados.add(puesto);
	}

	// ------------------------GETTERS AND SETTERS-----------------------//
	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

}
