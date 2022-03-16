package br.com.exercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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

        garagem.getListaVeiculos().sort((a, b) -> a.getPreco().compareTo(b.getPreco()));
        garagem.getListaVeiculos().forEach(veiculo -> System.out.println(veiculo));

        System.out.println("----------------------------------------------");

        garagem.getListaVeiculos().sort((a, b) -> a.getMarca().compareTo(b.getMarca()));
        garagem.getListaVeiculos().forEach(veiculo -> System.out.println(veiculo));

        System.out.println("----------------------------------------------");

        garagem.getListaVeiculos().stream().filter(veiculo -> veiculo.getPreco().compareTo(BigDecimal.valueOf(1000)) == -1).forEach(System.out::println);

        System.out.println("----------------------------------------------");

        garagem.getListaVeiculos().stream().filter(veiculo -> veiculo.getPreco().compareTo(BigDecimal.valueOf(1000)) >= 0).forEach(System.out::println);

        System.out.println("----------------------------------------------");

        BigDecimal somaPreco = BigDecimal.ZERO;

        for (Veiculo veiculo : garagem.getListaVeiculos() ) {
            somaPreco = somaPreco.add(veiculo.getPreco());
        }

        System.out.println(somaPreco.divide(BigDecimal.valueOf(11), 2, RoundingMode.HALF_UP));

    }
}
