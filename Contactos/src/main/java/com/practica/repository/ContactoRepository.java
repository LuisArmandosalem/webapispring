package com.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practica.entity.Contacto;


@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long>{
	
	@Query("SELECT con FROM Contacto con WHERE con.nombre=(:nombre)")
    Contacto findName(@Param("nombre") String nombre);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Contacto con WHERE con.nombre = (:nombre)")
    void deleteName(@Param("nombre") String nombre);
	
	
 
}
