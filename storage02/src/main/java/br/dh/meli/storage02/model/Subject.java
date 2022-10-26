package br.dh.meli.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor autoincrementável
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY) // um assunto para vários LIVROS, uma lista de livros
    @JsonIgnoreProperties("subject")
    private List<Book> books;
}
