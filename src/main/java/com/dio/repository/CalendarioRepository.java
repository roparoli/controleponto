package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.Calendario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long>{

}
