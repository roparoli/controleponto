package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.model.TipoData;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long>{

}
