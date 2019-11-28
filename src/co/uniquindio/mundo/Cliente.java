package co.uniquindio.mundo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * @author Luisa Cotte
 * @author Lissette Quebrada
 * @author Andres Cortes
 */
public class Cliente {

	// -----------------------ATRIBUTOS--------------------//
	private String id, nombre, apellido, direccion, email;
	private GregorianCalendar fechaNacimiento;
	private int estrato;
	private NivelEstudio nivelEstudio;
	private EstadoCivil estadoCivil;
	private Genero genero;
	private Tarjeta miTarjeta;
	private ArrayList<Respuesta> respuestas;

	/**
	 * Constructor de la clase Cliente
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param email
	 * @param anio
	 * @param mes
	 * @param dia
	 * @param estrato
	 * @param nivelEstudio
	 * @param estadoCivil
	 * @param genero
	 * @param mitargeta
	 */
	public Cliente(String id, String nombre, String apellido, String direccion, String email,
			GregorianCalendar fechaNacimiento, int estrato, NivelEstudio nivelEstudio, EstadoCivil estadoCivil,
			Genero genero, Tarjeta mitargeta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.estrato = estrato;
		this.nivelEstudio = nivelEstudio;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		fechaNacimiento = fechaNacimiento;
		
		
	}

	/**
	 * Constror vacio de la clase Ciente
	 */
	public Cliente() {
	}

	// --------------------------------GETTERS AND
	// SETTERS-----------------------------//
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEstrato() {
		return estrato;
	}

	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}

	public NivelEstudio getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(NivelEstudio nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Tarjeta getMiTarjeta() {
		return miTarjeta;
	}

	public void setMiTarjeta(Tarjeta miTarjeta) {
		this.miTarjeta = miTarjeta;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
}
