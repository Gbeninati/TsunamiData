package com.example.demo.Repositorios;

import java.io.Serializable;
import java.util.List;

import com.example.demo.Entidades.Estudiantes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioestudiantes")
public interface EstudiantesRepositorio extends JpaRepository<Estudiantes, Long>{
    
    public abstract Estudiantes findById(long id_estudiante);

    public abstract Estudiantes findByCorreo(String correo);

    public abstract List<Estudiantes> findAll();

    public abstract boolean deleteById(long id_estudiante);

    //public abstract boolean saveOrUpdate(Estudiantes estudiante);
}
