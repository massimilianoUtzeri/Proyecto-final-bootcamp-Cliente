package com.proyectoFinalBootcampClient.EntitySingleton;



public class PersonaSingleton {
	
	private static PersonaSingleton instance;
	private Long id;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	
	public PersonaSingleton(){	
	}
	
	public PersonaSingleton(Long id, String nombre, String apellido, String fechaDeNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public static PersonaSingleton getInstance(Long id,String nombre,String apellido,String fechaDeNacimiento) {
		if(instance==null) {
			instance = new PersonaSingleton(id,nombre,apellido,fechaDeNacimiento);
		}
		return instance;
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
	
	public static PersonaSingleton getInstance() {
		return instance;
	}

	public static void setInstance(PersonaSingleton instance) {
		PersonaSingleton.instance = instance;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PersonaSingleton [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}
	
	
	

}
