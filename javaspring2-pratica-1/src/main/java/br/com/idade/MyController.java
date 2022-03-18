package br.com.idade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class MyController {

    @GetMapping (path = "/{d}/{m}/{a}")
    public Integer getIdade (@PathVariable Integer d,
                         @PathVariable Integer m,
                         @PathVariable Integer a) {
        LocalDate dataNascimento = LocalDate.of(a, m, d);
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento,dataAtual).getYears();
    }
}
