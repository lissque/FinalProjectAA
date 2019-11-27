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

	public void agregarSeccion(TipoSeccion tipo) {
		Seccion nuevaSeccion = new Seccion(tipo);
		nuevaSeccion.llenarMatriz();
		secciones.add(nuevaSeccion);
	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

}
