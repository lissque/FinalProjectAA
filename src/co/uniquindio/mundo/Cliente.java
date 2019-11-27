package co.uniquindio.mundo;

import java.util.ArrayList;

public class Cliente {
	
	private String id, nombre, apellido, direccion, email;
	private Fecha fechaNacimiento;
	private int estrato;
	private NivelEstudio nivelEstudio;
	private EstadoCivil estadoCivil;
	private Genero genero;
	private Tarjeta miTarjeta;
	private ArrayList<Integer> respuestas;
	
	public Cliente(String id, String nombre, String apellido, String direccion, String email, Fecha fechaNacimiento,
			int estrato, NivelEstudio nivelEstudio, EstadoCivil estadoCivil, Genero genero, Tarjeta miTarjeta, ArrayList<Integer> respuestas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.estrato = estrato;
		this.nivelEstudio = nivelEstudio;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.miTarjeta = miTarjeta;
		this.respuestas=respuestas;
	}
	
	public Cliente() {}

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

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
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

	public ArrayList<Integer> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Integer> respuestas) {
		this.respuestas = respuestas;
	}
	
	
}
