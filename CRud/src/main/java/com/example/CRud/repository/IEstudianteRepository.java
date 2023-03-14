package com.example.CRud.repository;


import com.example.CRud.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IEstudianteRepository extends CrudRepository<Persona, Integer> {
}
