package com.proyectoFinalBootcampClient;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.proyectoFinalBootcampClient.*;
import com.proyectoFinalBootcampClient.Builder.Builder;
import com.proyectoFinalBootcampClient.EntitySingleton.PersonaSingleton;

@SpringBootApplication
@EnableEurekaClient
public class ProyectoFinalBootcampClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalBootcampClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Singleton
		PersonaSingleton p1 = PersonaSingleton.getInstance(1L,"Sigmund", "Freud","14-10-1992");
		System.out.println(p1.toString());
		
		PersonaSingleton p2 = PersonaSingleton.getInstance(2L,"Friederick", "Nietsche","11-02-1970");
		System.out.println(p2.toString());
		
		//Builder+Singleton
		Builder builder = new Builder();
		
		PersonaSingleton persona = builder.withId(3L)
		.withNombre("Juan")
		.withApellido("Antonio")
		.withFechaDeNacimiento("14/12/1998")
		.build();
		
		System.out.println(persona);
		
	}

}
