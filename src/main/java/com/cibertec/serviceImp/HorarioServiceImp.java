package com.cibertec.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Horario;
import com.cibertec.repository.HorarioRepository;
import com.cibertec.service.HorarioService;

@Service
public class HorarioServiceImp implements HorarioService {
	@Autowired
	private HorarioRepository repo;

	@Override
	public List<Horario> listarHorarios() {
		return repo.findAll();
	}

}
