package com.proyectoFinalBootcampClient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoFinalBootcampClient.entities.Ordenador;
import com.proyectoFinalBootcampClient.servicios.OrdenadorServiceInterface;

public class OrdenadorRestController {
	
	@RestController
	@RequestMapping("/rest/cliente")
	public class ClienteRestController {
		
		Ordenador ordenador = new Ordenador(10L,"MacBook","Air23","Negro",789.99);
		Ordenador ordenador2 = new Ordenador(10L,"Lenovo","x23","Blanco",430.99);
		
		@Autowired
		OrdenadorServiceInterface ordenadorService;
		
		@PostMapping("/add")
		public void addOrdenador() {
			
			ordenadorService.añadirOrdenador(ordenador);
			ordenadorService.añadirOrdenador(ordenador2);
		}
		
		@DeleteMapping("/delete")
		public void deleteOrdenador() {
			ordenadorService.eliminarOrdenador(ordenador);
		}
		
		@PutMapping("/modify")
		public void modifyOrdenador() {
			ordenadorService.modificarOrdenador(ordenador, 125.56);
		}
		
		@GetMapping("/showOrdenadores")
		public List<Ordenador> getlistaOrdenadores() {	
			return ordenadorService.listaOrdenadores();
		}
		
		
	}
}
