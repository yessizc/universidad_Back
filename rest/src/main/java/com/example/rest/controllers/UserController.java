package com.example.rest.controllers;

import com.example.rest.models.Users;
import com.example.rest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/ListarUser")
    public List <Users> ListarUser(Model model){
        List <Users> users=userService.finAll();
        return  users;
    }

    @PostMapping("/guardaruser")
    public String guardaruser(@RequestBody Users users){
        userService.save(users);
        return "el usuario se guardo correctamente\n"+users.getName();
    }

    @GetMapping("/buscarUserId/{id}")
    public Optional <Users> buscarUserId(@PathVariable Long id){
        Optional <Users> users= userService.findOne(id);
        return users;
    }

    @GetMapping("/eliminarUser/{id}")
    public String eliminarUser(@PathVariable Long id){
        userService.delete(id);
        return "usuario eliminado";
    }

    @GetMapping("/buscarUserName/{name}")
    public Optional <Users> buscarUserName(@PathVariable String name){
        Optional <Users> users=userService.findByName(name);
        return users;

    }
}
