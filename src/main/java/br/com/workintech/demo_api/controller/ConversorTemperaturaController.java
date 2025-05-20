package br.com.workintech.demo_api.controller;

import br.com.workintech.demo_api.services.ConversorTemperatura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorTemperaturaController {

    @GetMapping("/c-para-f/{c}")
    public double cParaF(@PathVariable double c) {
        return ConversorTemperatura.CparaF(c);
    }

    @GetMapping("/f-para-c/{f}")
    public double fParaC(@PathVariable double f) {
        return ConversorTemperatura.FparaC(f);
    }
}
