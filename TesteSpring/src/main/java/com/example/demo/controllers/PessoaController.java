package com.example.demo.controllers;

import com.example.demo.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {

    @GetMapping("/pessoas")
    public List<Pessoa> Pessoas(){
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Alex", 9,"alex@alex.coom"));
        pessoas.add(new Pessoa("Pedro", 7,"alex@alex.coom"));
        pessoas.add(new Pessoa("Cassia", 6,"alex@alex.coom"));

        return pessoas;

    }


}
