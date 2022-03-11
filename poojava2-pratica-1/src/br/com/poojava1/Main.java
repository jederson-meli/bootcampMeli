package br.com.poojava1;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("AAAAAAA", 35, "x7d8");
        Pessoa pessoa3 = new Pessoa("BBBBBB", 35, "x8jdj", 100.5, 1.80);

        System.out.println(pessoa3.ehMaiorIdade());

        int imc = pessoa3.calcularIMC();
        if (imc < 0) System.out.println("Abaixo do peso");
        else if (imc > 0) System.out.println("Sobrepeso");
        else System.out.println("Peso Saudável");
    }
}
