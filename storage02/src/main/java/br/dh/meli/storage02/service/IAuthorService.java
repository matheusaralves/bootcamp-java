package br.dh.meli.storage02.service;

import br.dh.meli.storage02.dto.AuthorDTO;
import br.dh.meli.storage02.model.Author;

public interface IAuthorService {
    Author insert(Author author);
    Author findById(long id);
    void deleteById(long id);
    AuthorDTO getById(long id);
    AuthorDTO getDtoEagle(long id);
}
