package br.com.javaspring3.starwars.repository;

import br.com.javaspring3.starwars.entity.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class CharacterRepository {
    private static List<Character> characters = new ArrayList<>();

    public List<Character> getCharactersByName (String name) {
        return characters.stream().filter(character -> character.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))).collect(Collectors.toList());
    }

    public List<Character> saveList(List<Character> characters) {
        if(CharacterRepository.characters.addAll(characters)) return characters;

        return new ArrayList<>();
    }
}
