package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.entity.Horario;
import com.cibertec.service.HorarioService;

@Controller
@RequestMapping("/rest/horario")
public class HorarioController {
	@Autowired
	private HorarioService horarioService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> listaCurso(){
		List<Horario> lstHorarios= horarioService.listarHorarios();
		return ResponseEntity.ok(lstHorarios);
	}
}
