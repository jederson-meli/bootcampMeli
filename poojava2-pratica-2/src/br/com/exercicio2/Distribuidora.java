package br.com.exercicio2;

import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        double valorTotal = 0;

        Produto produto1 = new Pereciveis("Carne", 40.39,2);
        produtos.add(produto1);
        Produto produto2 = new Pereciveis("Leite", 4.60,3);
        produtos.add(produto2);
        Produto produto3 = new NaoPereciveis("Óleo", 9.39,"Enlatado");
        produtos.add(produto3);
        Produto produto4 = new NaoPereciveis("Azeite", 20.39,"Enlatado");
        produtos.add(produto4);
        Produto produto5 = new Pereciveis("Pão", 7.39,1);
        produtos.add(produto5);

        for (Produto produto: produtos) {
            System.out.println(produto.toString());
            valorTotal += produto.calcular(2);
        }

        System.out.println("Valor total: " + valorTotal);

//        produtos.forEach(produto -> {
//            produto.toString();
//            valorTotal += produto.calcular(2);
//        });
    }



}
