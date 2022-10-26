package br.dh.meli.storage02.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor autoincrementável
    private long id;

    @Column(nullable = false) // obrigatório
    private String location;

    @OneToOne()
    @JoinColumn(name = "id_author")
    // indica que na tabela endereço, vou acrescentar uma coluna chamada id_author
    // JoinColumn vai ser a chave estrangeira
    private Author author;

}
