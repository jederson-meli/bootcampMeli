package br.com.supermarket;

import br.com.supermarket.model.Cliente;
import br.com.supermarket.model.Fatura;
import br.com.supermarket.model.Item;
import br.com.supermarket.repository.ClienteRepository;
import br.com.supermarket.repository.FaturaRepository;
import br.com.supermarket.repository.ItemRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ClienteRepository clienteList = new ClienteRepository();
        FaturaRepository faturaList = new FaturaRepository();
        ItemRepository itemList = new ItemRepository();

        Cliente cliente1 = new Cliente(1, "AAAAA", "AAAAA");
        clienteList.save(cliente1);
        Cliente cliente2 = new Cliente(2, "BBBBB", "BBBBB");
        clienteList.save(cliente2);
        Cliente cliente3 = new Cliente(3, "CCCCC", "CCCCC");
        clienteList.save(cliente3);

        clienteList.showList();
        clienteList.deleteById(2);
        System.out.println("-----------------------------------------------------");
        clienteList.showList();

        System.out.println("-----------------------------------------------------");

        System.out.println("Digite o ID do cliente");
        int id = s.nextInt();
        clienteList.findById(id);

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        Item item1 = new Item("MLB1010","Banana", 1, 4.70);
        itemList.save(item1);
        Item item2 = new Item("MLB4938","limao", 1, 3.50);
        itemList.save(item2);
        Item item3 = new Item("MLB9502","laranja", 1, 6.20);
        itemList.save(item3);


        Fatura fatura1 = new Fatura(cliente1, itemList.getItemList());
        fatura1.setTotal();
        faturaList.save(fatura1,clienteList);
        faturaList.showList();


    }
}
