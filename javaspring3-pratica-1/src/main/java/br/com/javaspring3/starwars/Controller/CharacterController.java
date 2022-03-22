package br.com.javaspring3.starwars.Controller;


import br.com.javaspring3.starwars.dto.CharacterDTO;
import br.com.javaspring3.starwars.entity.Character;
import br.com.javaspring3.starwars.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/character")
    public ResponseEntity getCharByName(@RequestParam String name) {
        return ResponseEntity.ok().body(characterService.findByName(name));
    }

    @PostMapping("/character")
    public ResponseEntity<List<CharacterDTO>> saveListCharacters (@RequestBody List<Character> characters) {
        return ResponseEntity.ok().body(characterService.saveList(characters));
    }
}
