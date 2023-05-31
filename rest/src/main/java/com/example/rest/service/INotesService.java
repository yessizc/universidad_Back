package com.example.rest.service;

import com.example.rest.models.Notes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface INotesService {

    public List<Notes> findAll();
    public  void save(Notes notes);
    public Optional<Notes> findOne(Long id);
    public void delete (Long id);

    public void  saveBatch(List<Notes> notes);
}
