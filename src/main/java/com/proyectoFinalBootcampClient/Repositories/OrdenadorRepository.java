package com.proyectoFinalBootcampClient.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoFinalBootcampClient.entities.Ordenador;


public interface OrdenadorRepository extends JpaRepository<Ordenador,Long>  {
	
	List<Ordenador> findByMarcaAndModelo(String marca, String modello);	
	
	List<Ordenador> findByColor(String color);
	
	List<Ordenador> findByPrecio(double precio);
	
	

}
