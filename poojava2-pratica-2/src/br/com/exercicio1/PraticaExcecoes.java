package br.com.exercicio1;

public class PraticaExcecoes {

    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            System.out.println(b/a);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não Pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }


}
