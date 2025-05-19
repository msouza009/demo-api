package br.com.workintech.demo_api.services;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        Calculator calc = new Calculator();
        int resultado = calc.add(2, 2);

    }
}
