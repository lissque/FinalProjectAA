package co.uniquindio.mundo;

import java.util.ArrayList;

public class Escenario {
	
	private ArrayList<TipoSeccion> secciones;

	public Escenario(ArrayList<TipoSeccion> secciones) {
		super();
		this.secciones = secciones;
	}

	public Escenario() {}

	public ArrayList<TipoSeccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<TipoSeccion> secciones) {
		this.secciones = secciones;
	}
	
	
}
