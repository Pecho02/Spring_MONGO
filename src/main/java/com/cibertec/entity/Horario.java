package com.cibertec.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "horario")
@NoArgsConstructor
@AllArgsConstructor
public class Horario {
	private int idHorario;
	private String fechaInicio;
	private String fechaFin;
	private String dia;
	private String horaInicio;
	private String horaFin;
	private String horas;
	private int idCurso;
	private int estudiantes;
}
