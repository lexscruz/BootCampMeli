package com.exercicio.convertromanos.controllers;

import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ConverInteirosRomanos {

    @GetMapping("/num")
    public String convertIntRomanos(@PathVariable Integer num){

        Map<Integer, String> convetIntRomanos = new HashMap();

        convetIntRomanos.put(1,"I");
        convetIntRomanos.put(2,"II");
        convetIntRomanos.put(3,"III");
        convetIntRomanos.put(4,"IV");
        convetIntRomanos.put(5,"V");
        convetIntRomanos.put(7,"VII");
        convetIntRomanos.put(10,"X");
        convetIntRomanos.put(13,"XIII");
        convetIntRomanos.put(100,"C");

        String chaveMap = convetIntRomanos.get(num);

        Set<Integer> conv = convetIntRomanos.keySet();

        for (Integer cv : conv) {
            String chaves = convetIntRomanos.get(num);
            System.out.println(cv);
            chaveMap = chaves.toString();
        }

        return chaveMap;
    }
}




