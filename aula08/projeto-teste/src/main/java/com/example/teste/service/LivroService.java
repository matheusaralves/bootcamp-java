package com.example.teste.service;

import com.example.teste.exception.LivroNotFoundException;
import com.example.teste.model.Livro;
import com.example.teste.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService implements ILivro{

    //Declara-se o repositório que está sendo utilizado através do autowired
    @Autowired
    private LivroRepository repo;

    @Override
    // Método que pegará individualmente o livro
    public Livro getLivro(int id) throws LivroNotFoundException {
        Optional<Livro> livro = repo.getLivro(id); // pega o livro pelo ID no repositório

        // Tratamento de exceção para caso o livro não seja encontrado
        if(livro.isEmpty()) {
            throw new LivroNotFoundException("Livro não encontrado.");
        }
        return livro.get();
    }

    @Override
    // Método que pegará a lista de livros
    public List<Livro> getAllLivro() {
        return null;
    }
}
