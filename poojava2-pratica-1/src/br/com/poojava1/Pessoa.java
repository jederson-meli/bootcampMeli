package br.com.poojava1;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC () {
        double imc = peso / (altura * altura);

        if (imc < 20) return -1;
        if (imc >= 20 && imc <= 25) return 0;
        return 1;
    }

    public boolean ehMaiorIdade () {
        if (idade >= 18) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nID: " + ID + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
