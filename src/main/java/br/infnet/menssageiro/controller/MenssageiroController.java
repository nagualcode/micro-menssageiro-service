package br.infnet.menssageiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenssageiroController {

    @GetMapping("/msg")
    public String produce() {
        return "Testando, testando, som, 1, 2, 3, alo, som, 1, 2, 3...";
    }
}
