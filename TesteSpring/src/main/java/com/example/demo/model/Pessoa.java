package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pessoa {

    private String nome;
    private int id;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
}
