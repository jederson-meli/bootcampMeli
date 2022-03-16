package br.com.supermarket.repository;

import br.com.supermarket.model.Cliente;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
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
    public boolean findById(int id) {

        for (Cliente cliente : clienteList) {
            if (cliente.getId() == id) {
                System.out.println(cliente);
                return true;
            }
        }
        System.out.println("Cliente não encontrado.");
        return false;
    }

    @Override
    public void deleteById(int id) {

        for (Cliente cliente : this.clienteList) {
            if (cliente.getId() == id) {
                this.clienteList.remove(cliente);
                return;
            }
        }
        System.out.println("Não foi possivel deletar o cliente: cliente inexistente no cadastro");
    }
}
