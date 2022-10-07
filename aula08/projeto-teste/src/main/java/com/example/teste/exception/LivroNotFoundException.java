package com.example.teste.exception;

public class LivroNotFoundException extends Exception{
    public LivroNotFoundException(String message) {
        super(message);
    }
}
