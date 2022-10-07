package com.example.teste.controller;

import com.example.teste.exception.LivroNotFoundException;
import com.example.teste.model.Livro;
import com.example.teste.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired // injecao de dependencia (O framework gera o objeto)
    private LivroService service; // importando a camada de service com as regras de negócio

    // O endpoint na URL será o ID do livro
    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivro(@PathVariable int id) {
        try {
            Livro livro = service.getLivro(id);
            return new ResponseEntity<>(livro, HttpStatus.OK);
        } catch(LivroNotFoundException ex) { // Caso não ache o livro, lança a exceção criada e o Status 200
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

}
