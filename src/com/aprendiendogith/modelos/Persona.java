package com.aprendiendogith.modelos;

public class Persona {
	
	private int id;
	
	private String cedula;
	
	private String nombre;
	
	private String apellido;
	
	private short edad;
	
	public Persona() {
		
	}

	public Persona(String cedula, String nombre, String apellido, short edad) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "id= " + id + ", nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + "";
	}


}
