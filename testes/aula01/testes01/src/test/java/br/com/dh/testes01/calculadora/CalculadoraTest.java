package br.com.dh.testes01.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    // cria o objeto que será usado em cada um dos testes
    Calculadora calculadora;

    // determina que criará o objeto antes de todos os testes
    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }


    // dado_que_quando_então
    // métodos_testado_o que é esperado_dados fornecidos

    @Test // VALIDANDO A SOMA
    @DisplayName("valida a soma")
    public void soma_returnDouble_whenValidInput() {
        // setup (Arrange)
        double n1 = 10;
        double n2 = 20;
        double expected = 30;

        // run (Act)
        double resp = calculadora.soma(n1, n2);

        // validate (Assert)
        assertEquals(expected, resp);
    }

    @Test // VALIDANDO A DIVISÃO
    @DisplayName("valida a divisão")
    public void dividir_returnDouble_whenTwoPositiveNumbers() {
        // setup (Arrange)
        double n1 = 30;
        double n2 = 3;
        double expected = 10;

        // run (Act)
        double resp = calculadora.dividir(n1, n2);

        // validate (Assert)
        assertEquals(expected, resp);
    }

    @Test // VALIDANDO O ZERO
    @DisplayName("valida o zero")
    public void dividir_returnZero_whenDivisorEqualsZero() {
        // setup (Arrange)
        double n1 = 20;
        double n2 = 0;
        double expected = 0;

        // run (Act)
        double resp = calculadora.dividir(n1, n2);

        // validate (Assert)
        assertEquals(expected, resp);
    }
}
