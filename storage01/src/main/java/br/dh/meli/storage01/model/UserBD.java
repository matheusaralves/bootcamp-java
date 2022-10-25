package br.dh.meli.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@NoArgsConstructor

@Entity // Entity faz a criaçao dos atributos no BD
@Table(name = "tb_user") // nome dado a tabela no BD (opcional)
public class UserBD {
    @Id // indica que o campo é Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // quer dizer que é autoincrementável
    private long cod;

    @Column(length = 150, nullable = false) // campo que deve ter no max 150 caracteres e não pode ser nulo
    private String name;

    @Column(name = "e_mail", length = 100, unique = true) // Campo chama e_mail, max 100 caracteres e único
    private String email;


}
