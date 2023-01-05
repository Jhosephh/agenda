package com.jgpe.agendabootstrap.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;


@Data
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;
    @NotBlank
    private String nombre;
    @NotNull
    @Past
    @Column(name = "fechanac")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaNacimiento;
    @NotBlank
    @Size(max = 10 )
    private  String celular;
    @NotEmpty
    @Email
    private  String email;

}
