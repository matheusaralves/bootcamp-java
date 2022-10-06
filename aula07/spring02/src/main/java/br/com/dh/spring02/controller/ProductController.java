package br.com.dh.spring02.controller;

import br.com.dh.spring02.dto.ProductDTO;
import br.com.dh.spring02.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "Produto 1", 10));
        products.add(new Product(2, "Produto 2", 30));
        products.add(new Product(3, "Produto 3", 30));
    }

    // MÉTODO GET
    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable int id) {
//        Product p = products.get(id-1);
        Optional<Product> product = products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        if (product.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        ProductDTO productDTO = new ProductDTO(product.get());
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

    // MÉTODO POST
    @PostMapping()
    public ResponseEntity<Product> newProduct(@RequestBody Product product) {
        product.setId(products.size());
        products.add(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    //MÉTODO DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable int id) {
        Optional<Product> product = products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        if (product.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        products.remove(product.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // PEGANDO A LISTA TODA
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
