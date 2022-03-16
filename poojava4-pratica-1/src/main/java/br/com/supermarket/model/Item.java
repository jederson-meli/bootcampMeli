package br.com.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    String codigo;
    String nome;
    int qtd;
    double price;

    @Override
    public String toString() {
        return "Item{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", qtd=" + qtd +
                ", price=" + price +
                '}';
    }
}
