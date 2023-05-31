package com.example.rest.service;

import com.example.rest.models.Notes;
import com.example.rest.repository.INotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class NotesServiceImp implements INotesService {

    @Autowired
    private INotesRepository notesRepository;

    @Override
    public List<Notes> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public void save(Notes notes) {
        notesRepository.save(notes);

    }

    @Override
    public Optional<Notes> findOne(Long id) {
        return notesRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        notesRepository.deleteById(id);

    }

    @Override
    public void saveBatch(List<Notes> notes) {
        for(Notes note : notes){
            notesRepository.save(note);
        }
    }
}
