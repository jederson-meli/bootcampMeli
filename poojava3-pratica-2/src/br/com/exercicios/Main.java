package br.com.exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList();
        listaVeiculos.add(new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1000)));
        listaVeiculos.add(new Veiculo("Ford", "Focus", BigDecimal.valueOf(1200)));
        listaVeiculos.add(new Veiculo("Ford", "Explorer", BigDecimal.valueOf(2500)));
        listaVeiculos.add(new Veiculo("Fiat", "Uno", BigDecimal.valueOf(500)));
        listaVeiculos.add(new Veiculo("Fiat", "Cronos", BigDecimal.valueOf(1000)));
        listaVeiculos.add(new Veiculo("Fiat", "Torino", BigDecimal.valueOf(1250)));
        listaVeiculos.add(new Veiculo("Chevrolet", "Aveo", BigDecimal.valueOf(1250)));
        listaVeiculos.add(new Veiculo("Chevrolet", "Spin", BigDecimal.valueOf(2500)));
        listaVeiculos.add(new Veiculo("Toyota", "Corola", BigDecimal.valueOf(1200)));
        listaVeiculos.add(new Veiculo("Toyota", "Fortuner", BigDecimal.valueOf(3000)));
        listaVeiculos.add(new Veiculo("Renault", "Logan", BigDecimal.valueOf(950)));

        Garagem garagem = new Garagem("1",listaVeiculos);

        listaVeiculos.sort((a, b) -> a.getPreco().compareTo(b.getPreco()));
        listaVeiculos.forEach(veiculo -> System.out.println(veiculo));
    }
}
