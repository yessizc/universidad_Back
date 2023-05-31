package com.example.rest.controllers;

import com.example.rest.models.Rol;
import com.example.rest.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rol")
public class RolController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/ListarRol")
    public List <Rol>ListarRol(Model model){
        List <Rol> rols=rolService.findAll();
        return rols;
    }

    @PostMapping("/guardaRol")
    public String guardaRol(@RequestBody Rol rol){
        rolService.save(rol);
        return "se guardo el rol";
    }

    @GetMapping("buscarRolId/{id}")
    public  Optional<Rol> buscarRolId(@PathVariable Long id){
        Optional <Rol> rol=rolService.findOne(id);
        return rol;
    }

    @GetMapping("/eliminarRol/{id}")
    public String eliminarRol(@PathVariable Long id){
        rolService.delete(id);
        return "rol eliminado";
    }
}
