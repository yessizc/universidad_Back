package com.example.rest.controllers;

import com.example.rest.models.Classroom;
import com.example.rest.service.IClassroomService;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classroom")

public class ClassroomController {

    @Autowired
    private IClassroomService classroomService;

    @GetMapping("/listarClass")
    public List <Classroom> listarClass(Model model){
        List <Classroom> classrooms=classroomService.findAll();
        return classrooms;
    }

    @PostMapping("/guardarClass")
    public String guardarClass(@RequestBody Classroom classroom){
        classroomService.save(classroom);
        return "clase guardada";
    }

    @GetMapping("/buscarClasId/{id}")
    public Optional <Classroom> buscarClasId(@PathVariable Long id){
        Optional <Classroom>classroom=classroomService.findOne(id);
        return classroom;
    }
    @GetMapping("/eliminarClass/{id}")
    public  String eliminarClass(@PathVariable Long id){
        classroomService.delete(id);
        return "se ha eliminado la clase";
    }
}
