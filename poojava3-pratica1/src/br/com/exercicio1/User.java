package br.com.exercicio1;

public abstract class User {
    private String name;
    private String cpf;

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}
