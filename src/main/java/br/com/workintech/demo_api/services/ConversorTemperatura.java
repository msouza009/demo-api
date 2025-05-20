package br.com.workintech.demo_api.services;

public class ConversorTemperatura {
    public static double CparaF(double c) {
        return (c * 9/5) + 32;
    }

    public static double FparaC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double c = 25.0;
        double f = 77.0;

         double resultadoF = CparaF(c);
        double resultadoC = FparaC(f);

        System.out.println(c + "°C = " + resultadoF + "°F");
        System.out.println(f + "°F = " + resultadoC + "°C");
    }
}
