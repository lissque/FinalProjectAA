package co.uniquindio.mundo;

import java.util.ArrayList;

public class Encuesta {
	
	private final String ENCUESTA = "Encuesta";
	private ArrayList<Pregunta> preguntas;
	
	public Encuesta() {
		preguntas = new ArrayList<Pregunta>();
		Pregunta pregunta1 = new Pregunta();
		Pregunta pregunta2 = new Pregunta();
		Pregunta pregunta3 = new Pregunta();
		Pregunta pregunta4 = new Pregunta();
		Pregunta pregunta5 = new Pregunta();
		Pregunta pregunta6 = new Pregunta();
		pregunta1.setPregunta("¿Califique su experiencia en el proceso de compra de boletas?");
		pregunta2.setPregunta("¿Que tan probable seria que usted siga comprando con nosotros?");
		pregunta3.setPregunta("¿Que tan rapido considera que fue el servicio?");
		pregunta4.setPregunta("¿Que tan versatil considera el manejo de la aplicacion?");
		pregunta5.setPregunta("¿Que tan probable seria que recomendara esta aplicacio?");
		pregunta6.setPregunta("¿Que tan seguro se sintio con el manejo sus datos y usando nuestras formas de pago?");
		preguntas.add(pregunta1);
		preguntas.add(pregunta2);
		preguntas.add(pregunta3);
		preguntas.add(pregunta4);
		preguntas.add(pregunta5);
		preguntas.add(pregunta6);
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public String getENCUESTA() {
		return ENCUESTA;
	}
	
	
}
