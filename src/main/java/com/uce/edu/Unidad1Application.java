package com.uce.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

@SpringBootApplication
public class Unidad1Application implements CommandLineRunner{
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@Autowired
	private Materia materia;

	@Autowired
	private Materia materia1;


	@Autowired
	private Materia materia2;

	public static void main(String[] args) {
		SpringApplication.run(Unidad1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.materia.setNombre("Avanzada II");
		System.out.println(this.materia);

		System.out.println(this.materia1);
		this.materia.setNombre("nuevo nombre");

		System.out.println(this.materia);
		System.out.println(this.materia1);

		this.materia2.setNombre("nombre final");
		System.out.println(this.materia2);
		System.out.println(this.materia1);
		System.out.println(this.materia);
		
	}

}
