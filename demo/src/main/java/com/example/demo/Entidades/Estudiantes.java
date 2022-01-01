package com.example.demo.Entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Estudiante")
@Entity
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_estudiante")
    long id_estudiante;

    @Column(name="nombre")
    String nombre;

    @Column(name="password")
    String password;

    @Column(name="rol")
    String rol;

    @Column(name="correo")
    String correo;

    @Column(name="carrera")
    String carrera;

    public Estudiantes(){

    }

    public Estudiantes(long id_estudiante, String nombre, String password, String rol, String correo, String carrera){
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.correo = correo;
        this.carrera = carrera;
    }

    public long getId_estudiante(){
        return this.id_estudiante;
    }

    public void SetId_estudiante(long id){
        this.id_estudiante = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPassword(){
        return this.password;
    }

    public void SetPassword(String password){
        this.password = password;
    }

    public String getRol(){
        return this.rol;
    }

    public void SetRol(String rol){
        this.rol = rol;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void SetCorreo(String correo){
        this.correo = correo;
    }

    public String getCarrera(){
        return this.carrera;
    }

    public void SetCarrera(String carrera){
        this.carrera = carrera;
    }

}


