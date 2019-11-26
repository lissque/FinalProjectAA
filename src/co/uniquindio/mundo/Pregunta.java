package co.uniquindio.mundo;

public class Pregunta {
	private String pregunta;
	private Respuesta respuesta;
	
	public Pregunta(String pregunta, Respuesta respuesta) {
		this.pregunta=pregunta;
		this.respuesta=respuesta;
	}
	
	public Pregunta() {	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
