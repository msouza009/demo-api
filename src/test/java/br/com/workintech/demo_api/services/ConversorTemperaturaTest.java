package br.com.workintech.demo_api.services;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        double celsius = 30.0;

        double expectedFahrenheit = 86.0;

        double fahrenheit = ConversorTemperatura.CparaF(celsius);

        assertThat(fahrenheit).isEqualTo(expectedFahrenheit);
    }

    @Test
    public void shouldConvertFahrenheitToCelsius() {
        double fahrenheit = 86.0;

        double expectedCelsius = 30.0;

        double celsius = ConversorTemperatura.FparaC(fahrenheit);

        assertThat(celsius).isEqualTo(expectedCelsius);
    }
}
