package br.com.supermarket.repository;

import java.util.Optional;

public interface Repository<T> {

    public void save(T object);
    public void showList();
    public boolean findById(int id);
    public void deleteById(int id);
}
