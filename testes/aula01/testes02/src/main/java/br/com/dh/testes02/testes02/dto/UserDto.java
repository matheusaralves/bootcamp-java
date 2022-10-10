package br.com.dh.testes02.testes02.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

        @NotBlank(message = "O nome é obrigatório")
        // não pode ser nulo e nem vazio
        private String name;

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "O e-mail deve ser válido")
        private String email;

        @Min(value = 18, message = "A idade mínima é 18 anos")
        // valor mínimo de 1 8 anos
        private int idade;
}
