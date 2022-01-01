package com.example.demo.Controladores;

import java.util.List;


import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    @Qualifier("serviciousuario")
    UsuarioServicio servicio;

    @GetMapping("/getAll")
    public List<Usuario> getAllUsuario(){
        return servicio.obtenerAll();
    }

    

    @PostMapping("/crear")
    public long agregarUsuario(@RequestBody Usuario user){
        return servicio.crear(user);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminarUsuario(@PathVariable("id") long id){
        return servicio.eliminar(id);
    }

    
}
