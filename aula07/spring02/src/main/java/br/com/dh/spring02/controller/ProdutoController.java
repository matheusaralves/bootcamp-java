package br.com.dh.spring02.controller;

import br.com.dh.spring02.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable int id) {
        return new Produto(1, "Produto 1", 50);

    }
}
