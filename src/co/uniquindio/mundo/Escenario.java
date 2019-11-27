package co.uniquindio.mundo;

import java.util.ArrayList;

public class Escenario {

	private ArrayList<Seccion> secciones;

	public Escenario(ArrayList<Seccion> secciones) {
		super();
		this.secciones = secciones;
	}

	public Escenario() {
	}

<<<<<<< Updated upstream
	public void agregarSeccion(TipoSeccion tipo) {
		Seccion seccion = new Seccion(tipo);
		seccion.llenarMatriz();
=======
	public void crearClubFans() {
		Seccion nuevaSeccion = new Seccion(TipoSeccion.CLUB_FANS);
	}

	public void crearPlatea1() {

	}

	public void crearPlatea2() {

	}

	public void crearSegundoPiso1() {

	}

	public void crearSegundoPiso2() {

>>>>>>> Stashed changes
	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

}
