package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.Entidades.Estudiantes;
import com.example.demo.Repositorios.EstudiantesRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicioestudiantes")
public class EstudiantesServicio {
    @Autowired
    @Qualifier("repositorioestudiantes")
    private EstudiantesRepositorio repositorio;

    public long crear(Estudiantes estudiante){
        try{
            repositorio.save(estudiante);
            return estudiante.getId_estudiante();
        } catch (Exception e) {
            return -1;
        }
    }

    public Estudiantes encontrar(String correo){
         return repositorio.findByCorreo(correo);  
    }

    
    public boolean actualizar(Estudiantes estudiante){
        try{
            repositorio.save(estudiante);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean eliminar(long id){
        try{
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Estudiantes> obtenerAll(){
        return repositorio.findAll();
    }
}
