package com.example.rest.controllers;

import com.example.rest.models.Asignature;
import com.example.rest.service.IAsignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Asignature")
public class AsignatureController {

    @Autowired
    private IAsignatureService asignatureService;

    @GetMapping("/listarAsignature")
    public List <Asignature> listarAsignature(Model model){
        List <Asignature>asignatures=asignatureService.findAll();
        return asignatures;
    }

    @PostMapping ("/guadarAsignature")
    public String guadarAsignature(@RequestBody Asignature asignature){
        asignatureService.save(asignature);
        return "asignatura guardada";
    }

    @GetMapping("/buscarAsignature/{id}")
    public Optional <Asignature> asignature(@PathVariable Long id){
        Optional <Asignature>asignature=asignatureService.finOne(id);
        return asignature;
    }

    @GetMapping("/eliminarAsignature/{id}")
    public String eliminarAsignature(@PathVariable long id){
        asignatureService.delete(id);
        return "asignatura eliminada";
    }


    @GetMapping("/Bucarnombre/{nombre}")
    public Optional<Asignature> asignature(@PathVariable String name){
        Optional<Asignature> asignature=asignatureService.findByName(name);
        return asignature;
    }




}
