package com.jgpe.agendabootstrap;

import com.jgpe.agendabootstrap.model.Contacto;
import com.jgpe.agendabootstrap.repo.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class AgendaBootstrapApplication {

	@Autowired
	private ContactoRepository contactoRepository;

	@PostConstruct
	void init() {
		Contacto contacto1 = new Contacto();
		contacto1.setNombre("jose");
		contacto1.setCelular("123456789");
		contacto1.setEmail("lup_1284@hotmail.com");
		contacto1.setFechaNacimiento(LocalDate.now());

		contactoRepository.save(contacto1);

		Contacto contacto2 = new Contacto();
		contacto2.setNombre("maria");
		contacto2.setCelular("123456789");
		contacto2.setEmail("maria_1284@hotmail.com");
		contacto2.setFechaNacimiento(LocalDate.now());

		contactoRepository.save(contacto2);

		contactoRepository.findAll().forEach(c -> {
			System.out.println("Contacto: " + c.getNombre());
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaBootstrapApplication.class, args);
	}

}
