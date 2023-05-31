package com.example.rest.controllers;

import com.example.rest.models.Classroom_user;
import com.example.rest.service.IClassroom_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Classroom_user")

public class Classromm_userController {

    @Autowired
    private IClassroom_userService classroomUserService;

    @GetMapping("/listarClasUser")
    public List <Classroom_user>listarClasUser(Model model){
        List <Classroom_user> classroomUsers=classroomUserService.findAll();
        return classroomUsers;
    }

    @PostMapping("/guardarClassUser")
    public String guardarClassUser(@RequestBody Classroom_user classroomUser){
        classroomUserService.save(classroomUser);
        return "clase usuario guardada";
    }
    @GetMapping ("/buscarClassUser/{id}")
    public Optional<Classroom_user>buscarClassUser(@PathVariable Long id){
        Optional<Classroom_user> classroomUser=classroomUserService.findOne(id);
        return classroomUser;
    }

    @GetMapping("/eliminarClasUser/{id}")
    public  String eliminarClasUser(@PathVariable Long id){
        classroomUserService.delete(id);
        return "clase usuario eliminada";
    }
}
