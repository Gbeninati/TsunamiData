package com.example.demo.Controladores;

import java.util.List;


import com.example.demo.Entidades.Estudiantes;
import com.example.demo.Servicios.EstudiantesServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    @Qualifier("servicioestudiantes")
    EstudiantesServicio servicio;

    @GetMapping("/getAll")
    public List<Estudiantes> getAllEstudiantes(){
        return servicio.obtenerAll();
    }

    @GetMapping("/getByCorreo/{correo}")
    public Estudiantes getEstudianteCorreo(@PathVariable("correo") String correo){
        return servicio.encontrar(correo);
    }

    @PostMapping("/crear")
    public long agregarEstudiantes(@RequestBody Estudiantes estudiante){
        return servicio.crear(estudiante);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminarEstudiantes(@PathVariable("id") long id){
        return servicio.eliminar(id);
    }

    
    @PutMapping("/editar")
    public boolean editarEstudiantes(@RequestBody Estudiantes estudiante){
        return servicio.actualizar(estudiante);
    }
    
}
