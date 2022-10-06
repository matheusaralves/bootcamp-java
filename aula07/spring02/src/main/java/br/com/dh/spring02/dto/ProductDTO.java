package br.com.dh.spring02.dto;

import br.com.dh.spring02.model.Product;
import lombok.Data;

@Data
public class ProductDTO {
    private String nome;
    private double valor;

    public ProductDTO(Product product) {
        this.nome = product.getNome();
        this.valor = product.getValor();
    }
}
