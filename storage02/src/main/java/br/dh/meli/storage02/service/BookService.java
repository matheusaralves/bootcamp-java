package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Book;
import br.dh.meli.storage02.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService{

    private final BookRepo repo;

    @Override
    public Book findById(long id) {
        Optional<Book> optionalBook = repo.findById(id);
        return optionalBook.orElse(null);
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }
}
