package com.cibertec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cibertec.entity.Horario;

public interface HorarioRepository extends MongoRepository<Horario, Integer>{

}
