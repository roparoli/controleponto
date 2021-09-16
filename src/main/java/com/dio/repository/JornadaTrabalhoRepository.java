package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.JornadaTrabalho;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long>{

}
