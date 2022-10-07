package com.example.teste.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Anotações do Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private String nota;

}
