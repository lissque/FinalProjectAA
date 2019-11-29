package co.uniquindio.mundo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Clase Cliente
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE S�NCHEZ
 * @author ANDR�S FELIPE CORT�S RODR�GUEZ
 */
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 *            Id del cliente
	 * @param nombre
	 *            Nombre del cliente
	 * @param apellido
	 *            Apellido del cliente
	 * @param direccion
	 *            Direcci�n del cliente
	 * @param email
	 *            Email del cliente
	 * @param estrato
	 *            Estrato del cliente
	 * @param nivelEstudio
	 *            Nivel de estudio del cliente
	 * @param estadoCivil
	 *            Estado civil del cliente
	 * @param genero
	 *            Genero del cliente
	 * @param mitarjeta
	 *            Tarjeta del cliente
	 */
	public Cliente(String id, String nombre, String apellido, String direccion, String email,
			GregorianCalendar fechaNacimiento, int estrato, NivelEstudio nivelEstudio, EstadoCivil estadoCivil,
			Genero genero, Tarjeta mitarjeta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.estrato = estrato;
		this.nivelEstudio = nivelEstudio;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.miTarjeta=mitarjeta;
		fechaNacimiento = fechaNacimiento;

	}

	/**
	 * Constror vacio de la clase Ciente
	 */
	public Cliente() {
	}

	// -------------------------GETTERS AND SETTERS--------------------------//
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
