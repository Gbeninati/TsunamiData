package com.example.demo.Repositorios;


import java.util.List;

import com.example.demo.Entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriousuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
    public abstract Usuario findById(long id_estudiante);

    public abstract List<Usuario> findAll();

    public abstract boolean deleteById(long id_estudiante);

    //public abstract boolean saveOrUpdate(Usuario estudiante);
}
