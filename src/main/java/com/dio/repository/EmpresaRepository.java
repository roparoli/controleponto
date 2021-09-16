package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
