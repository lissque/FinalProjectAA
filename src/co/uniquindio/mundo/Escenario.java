package co.uniquindio.mundo;

import java.util.ArrayList;

public class Escenario {

	private ArrayList<Seccion> secciones;
	private ArrayList<Puesto> puestosSeleccionados;

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

	public void agregarClubFans() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.CLUB_FANS);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}
	
	public void agregarPlatea1() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.PLATEA_1);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}
	
	public void agregarPlatea2() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.PLATEA_2);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}
	
	public void agregarSegundo1() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.SEGUNDO_PISO_1);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}
	
	public void agregarSegundo2() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.SEGUNDO_PISO_2);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}
	
	public void agregarPuesto(Puesto puesto) {
		puestosSeleccionados.add(puesto);
	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

}
