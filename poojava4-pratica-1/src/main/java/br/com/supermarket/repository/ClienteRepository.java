package br.com.supermarket.repository;

import br.com.supermarket.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepository implements Repository<Cliente>{

    List<Cliente> clienteList;

    public ClienteRepository () {
        this.clienteList = new ArrayList<>();
    }

    @Override
    public void save(Cliente object) {
        clienteList.add(object);
    }

    @Override
    public void showList() {
        clienteList.forEach(System.out::println);
    }

    @Override
    public Optional<Cliente> findById(int id) {
        boolean isPresent = false;
        for (Cliente cliente : clienteList) {
            if (cliente.getId() == id) {
                System.out.println(cliente);
                isPresent = true;
            }
        }
        if (!isPresent) System.out.println("Cliente não encontrado.");
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {
        for (Cliente cliente : clienteList) {
            if (cliente.getId() == id) {
                clienteList.remove(cliente);
            }
        }


    }
}
