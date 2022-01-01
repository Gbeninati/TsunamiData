package com.example.demo.Entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    long id;

    @Column(name="ruta")
    String ruta;

    @Column(name="tiempos")
    String tiempos;

    @Column(name="grilla", length = 10000)
    String grilla;

    public Usuario(){

    }

    public Usuario(long id, String ruta, String tiempos, String grilla){
        this.id = id;
        this.ruta = ruta;
        this.tiempos = tiempos;
        this.grilla = grilla;
    }

    public long getId(){
        return this.id;
    }

    public void SetId(long id){
        this.id = id;
    }

    public String getRuta(){
        return this.ruta;
    }

    public void SetRuta(String ruta){
        this.ruta = ruta;
    }

    public String getTiempos(){
        return this.tiempos;
    }

    public void SetTiempos(String tiempos){
        this.tiempos = tiempos;
    }

    public String getGrilla(){
        return this.grilla;
    }

    public void SetGrilla(String grilla){
        this.grilla = grilla;
    }


}


