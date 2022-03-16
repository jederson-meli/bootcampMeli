package br.com.supermarket;

import br.com.supermarket.model.Cliente;
import br.com.supermarket.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ClienteRepository clienteList = new ClienteRepository();

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


    }
}
