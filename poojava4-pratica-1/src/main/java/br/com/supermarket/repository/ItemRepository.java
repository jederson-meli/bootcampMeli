package br.com.supermarket.repository;

import br.com.supermarket.model.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ItemRepository implements Repository<Item>{

    List<Item> itemList;

    public ItemRepository () {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void save(Item object) {
        itemList.add(object);
    }

    @Override
    public void showList() {

    }

    @Override
    public boolean findById(int id) {
        return false;
    }

    @Override
    public void deleteById(int id) {

    }
}
