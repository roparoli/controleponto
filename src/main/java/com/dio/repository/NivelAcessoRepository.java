package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.NivelAcesso;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long>{

}
