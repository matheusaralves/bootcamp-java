package com.example.teste.service;

import com.example.teste.exception.LivroNotFoundException;
import com.example.teste.model.Livro;

import java.util.List;

public interface ILivro {
    Livro getLivro(int id) throws LivroNotFoundException;
    List<Livro> getAllLivro();

}
