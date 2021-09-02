package com.exemplo.demo.controllers;

import com.exemplo.demo.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testaEndPoints {

    @GetMapping("/pessoa")
    public Pessoa retornaPessoa(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam int idade){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
        pessoa.setIdade(idade);
        return pessoa;
    }
}
