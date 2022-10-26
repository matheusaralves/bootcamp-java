package br.dh.meli.storage02.controller;

import br.dh.meli.storage02.model.Author;
import br.dh.meli.storage02.model.Book;
import br.dh.meli.storage02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("{id}")
    public ResponseEntity<Book> findById(@PathVariable Author id) {
        Book book = service.findById(id.getId());

        if(book != null) {
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
