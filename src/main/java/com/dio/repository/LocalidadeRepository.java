package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.Localidade;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long>{

}
