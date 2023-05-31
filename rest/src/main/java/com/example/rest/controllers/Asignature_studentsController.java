package com.example.rest.controllers;

import com.example.rest.models.Asignature_students;
import com.example.rest.service.IAsignature_studentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Asignature_student")

public class Asignature_studentsController {

    @Autowired
    private IAsignature_studentsService asignatureStudentsService;

    @GetMapping("/listarAignature_student")
    public List <Asignature_students> listarAignature_student(Model model){
        List <Asignature_students>asignatureStudents= asignatureStudentsService.findAll();
        return asignatureStudents;
    }

    @PostMapping("guardarAsigna_stude")
    public String guardarAsigna_stude(@RequestBody Asignature_students asignatureStudents){
        asignatureStudentsService.save(asignatureStudents);
        return "se ha guardado correctamente";
    }

    @GetMapping("/buscarAsig_stu/{id}")
    public Optional<Asignature_students> buscarAsig_stu(@PathVariable Long id){
        Optional<Asignature_students>asignatureStudents=asignatureStudentsService.findOne(id);
        return asignatureStudents;
    }

    @GetMapping("/eliminarAsigna_estu/{id}")
    public String eliminarAsigna_estu (@PathVariable Long id){
        asignatureStudentsService.delete(id);
        return "se ha eliminado";
    }



}
