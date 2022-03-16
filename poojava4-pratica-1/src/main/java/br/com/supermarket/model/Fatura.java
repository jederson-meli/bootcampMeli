package br.com.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Fatura {

    Cliente cliente;
    List<Item> listItem;
    double total;

    public Fatura (Cliente cliente, List<Item> listItem) {
        this.cliente = cliente;
        this.listItem = listItem;
    }

    public void setTotal() {
        double total = 0;
        for (Item item: listItem) {
            total += item.getPrice() * item.getQtd();
        }
        this.total = Math.round(total);

    }

    @Override
    public String toString() {
        return "Fatura{" +
                "\ncliente=" + cliente +
                ",\n listItem=" + listItem +
                ",\n total=" + total +
                '}';
    }
}
