package com.proyectoFinalBootcampClient.entities;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
	
	private Long id;
	
	private String marca;
	
	private String modelo;
	
	private String color;
	
	private double precio;
	
	private static List <Ordenador> listaOrdenadores = new ArrayList<> ();
	
	
	
	public Ordenador() {
		
	}

	public Ordenador(Long id,String marca, String modelo, String color, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public static List<Ordenador> getListaOrdenadores() {
		listaOrdenadores.add(new Ordenador(1L,"Asus","x80","Rojo",375.40));
		listaOrdenadores.add(new Ordenador(2L,"Toshiba","y56","Azul",400.50));
		listaOrdenadores.add(new Ordenador(3L,"MacBook","Air123","Gris",790.30));
		listaOrdenadores.add(new Ordenador(4L,"Lenovo","l23b","Blue",290.40));
		listaOrdenadores.add(new Ordenador(5L,"Acer","az98","Verde",500.40));
		listaOrdenadores.add(new Ordenador(6L,"Compaq","12kl","Rosa",460.40));
		return listaOrdenadores;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + "]";
	}
	
	


}
