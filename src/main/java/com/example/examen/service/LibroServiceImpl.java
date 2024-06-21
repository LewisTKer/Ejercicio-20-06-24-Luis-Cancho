package com.example.examen.service;

import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.LibroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
	private LibroRepository repository;

    @Override
    public List<Libro> listaLibrosPorCategoria(String categories) {
        return repository.findByCategories(categories);
    }
}
