package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.GregorianCalendar;


    @RestController
    public class ObtemIdadePessoaController {

        @GetMapping(value = "/pessoa/{dia}/{mes}/{ano}")
        public int pessoa(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano){
            GregorianCalendar gc = new GregorianCalendar();


            return gc.get(Calendar.YEAR) - ano;

        }


    }

