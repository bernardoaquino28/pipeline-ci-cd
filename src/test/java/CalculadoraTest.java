package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(8, calc.somar(5, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calc.dividir(10, 5));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
