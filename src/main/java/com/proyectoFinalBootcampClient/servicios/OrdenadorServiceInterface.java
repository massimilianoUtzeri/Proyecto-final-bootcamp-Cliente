package com.proyectoFinalBootcampClient.servicios;

import java.util.List;

import com.proyectoFinalBootcampClient.entities.Ordenador;

public interface OrdenadorServiceInterface {
	
	 void añadirOrdenador(Ordenador ordenador);
	 
	 List<Ordenador> listaOrdenadores();
	 
	 Ordenador modificarOrdenador(Ordenador ordenador,double precio);
	 
	 void eliminarOrdenador(Ordenador ordenador);
	 
	 List<Ordenador> listaOrdenadoresPorColor(String color);
	 
	 List<Ordenador> listaOrdenadoresPorPrecio(double precio);
	 
	 Ordenador buscarOrdenadorPorId(Long id);
	 
	 

}
