package br.com.javaspring3.starwars.service;

import br.com.javaspring3.starwars.dto.CharacterDTO;
import br.com.javaspring3.starwars.entity.Character;
import br.com.javaspring3.starwars.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<CharacterDTO> findByName (String name) {
        return CharacterDTO.convertToDTO(characterRepository.getCharactersByName(name));
    }

    public List<CharacterDTO> saveList(List<Character> characters) {
        return CharacterDTO.convertToDTO(characterRepository.saveList(characters));
    }
}
