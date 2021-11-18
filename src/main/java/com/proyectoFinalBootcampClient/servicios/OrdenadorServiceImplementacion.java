package com.proyectoFinalBootcampClient.servicios;


import java.util.List;
import java.util.stream.Collectors;

import com.proyectoFinalBootcampClient.entities.Ordenador;

public class OrdenadorServiceImplementacion implements OrdenadorServiceInterface{

	@Override
	public void añadirOrdenador(Ordenador ordenador) {
		Ordenador.getListaOrdenadores().add(ordenador);
	}

	@Override
	public List<Ordenador> listaOrdenadores() {
		return Ordenador.getListaOrdenadores();
	}

	@Override
	public Ordenador modificarOrdenador(Ordenador ordenador,double precio) {
		if(Ordenador.getListaOrdenadores().contains(ordenador)) {
			ordenador.setPrecio(precio);
			return ordenador;
		}else {
			return null;
		}
		
	}

	@Override
	public void eliminarOrdenador(Ordenador ordenador) {
		if(Ordenador.getListaOrdenadores().contains(ordenador)) {
			Ordenador.getListaOrdenadores().remove(ordenador);
		}
		else {
			System.out.println("El ordenador no está presente en la lista");
		}
		
	}

	@Override
	public List<Ordenador> listaOrdenadoresPorColor(String color) {
		List <Ordenador> listaOrdenadoresFuncionalPorColor = Ordenador.getListaOrdenadores().stream().filter(x -> x.getColor().equals(color)).collect(Collectors.toList());
		/*List <Ordenador> listaOrdenadoresPorColor = new ArrayList<> ();
		for(Ordenador x : Ordenador.getListaOrdenadores()) {
			if(x.getColor().equals(color)) {
				listaOrdenadoresPorColor.add(x);
			}
		}	
			return Ordenador.getListaOrdenadores();
		*/
			return listaOrdenadoresFuncionalPorColor;
	}
	

	@Override
	public List<Ordenador> listaOrdenadoresPorPrecio(double precio) {
		List <Ordenador> listaOrdenadoresFuncionalPorPrecio = Ordenador.getListaOrdenadores().stream().filter(x -> x.getPrecio()==(precio)).collect(Collectors.toList());
		/*List <Ordenador> listaOrdenadoresPorPrecio = new ArrayList<> ();
		for(Ordenador x : Ordenador.getListaOrdenadores()) {
			if(x.getPrecio()== precio) {
				listaOrdenadoresPorPrecio.add(x);
			}
		}	
			return Ordenador.getListaOrdenadores();
		*/
			return listaOrdenadoresFuncionalPorPrecio;
	}

	@Override
	public Ordenador buscarOrdenadorPorId(Long id) {
		Ordenador ordenador = null;
		for(Ordenador x : Ordenador.getListaOrdenadores()) {
			if(x.getId() == id) {
				ordenador = new Ordenador(id,x.getMarca(),x.getModelo(),x.getColor(),x.getPrecio());
			}
		}
			return ordenador;
	}

}
