package com.example.rest.controllers;

import com.example.rest.models.Notes;
import com.example.rest.service.INotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Notes")

public class NotesController {

    @Autowired
    private INotesService notesService;

    @GetMapping("/ListarNote")
    public List <Notes>ListarNote(Model model){
        List <Notes> notes=notesService.findAll();
        return notes;
    }

    @PostMapping("/guardarNote")
    public String guardarNote(@RequestBody Notes notes){
        notesService.save(notes);
        return "la nota se ha guardado";
    }

    @GetMapping("/buscarNoteId/{id}")
    public Optional <Notes>buscarNoteId(@PathVariable Long id){
        Optional <Notes> notes=notesService.findOne(id);
        return notes;
    }

    @GetMapping("/eliminarNote/{id}")
    public String eliminarNote(@PathVariable Long id) {
        notesService.delete(id);
        return "nota eliminada";
    }

    @PostMapping("/saveBatch")
    public List <Notes>saveBatch(@RequestBody List<Notes> notes) {
        notesService.saveBatch(notes);
        return notes;
    }

}
