package com.proyectoFinalBootcampClient.Builder;

import com.proyectoFinalBootcampClient.EntitySingleton.PersonaSingleton;

public class Builder implements BuilderInterface {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	
	
	public Builder withId(Long id) {
		this.id = id;	
		return this;
	}
	
	public Builder withNombre(String nombre) {
		this.nombre = nombre;	
		return this;
	}

	public Builder withApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	public Builder withFechaDeNacimiento(String FechaDeNacimiento) {
		this.fechaDeNacimiento = FechaDeNacimiento;
		return this;
	}

	@Override
	public PersonaSingleton build() {
		PersonaSingleton.getInstance(this.id,this.nombre,this.apellido,this.fechaDeNacimiento);
		return PersonaSingleton.getInstance();
	}
}
