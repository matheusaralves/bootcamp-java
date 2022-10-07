package com.example.teste.repository;

import com.example.teste.exception.LivroNotFoundException;
import com.example.teste.model.Livro;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class LivroRepository {
    // pega o arquivo json
    private final String linkFile = "src/main/resources/livros.json";

    // método que irá mapear seu conteúdo
    ObjectMapper mapper = new ObjectMapper();

    public Optional<Livro> getLivro(int id) {
        // instanciando a lista de livros
        List<Livro> livros = null;

        // try catch para pegar o conteúdo dos livros, transformar num array list, mapear e ler seu valor
        try {
            livros = Arrays.asList(mapper.readValue(new File(linkFile), Livro[].class));
        } catch(Exception ex) {

        }

        // ForAll para percorrer cada um dos itens do array livros
        for(Livro l : livros) {
            if(l.getId() == id) {
                return Optional.of(l);
            }
        }
        return Optional.empty();
    }


}
