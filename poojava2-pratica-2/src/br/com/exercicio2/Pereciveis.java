package br.com.exercicio2;

public class Pereciveis extends Produto{

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        int modificador = 1;
        switch (diasParaVencer) {
            case 1:
                modificador = 4;
                break;
            case 2:
                modificador = 3;
                break;
            case 3:
                modificador = 2;
                break;
            default:
        }
        return super.calcular(quantidadeDeProdutos) / modificador;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                "} " + super.toString();
    }
}
