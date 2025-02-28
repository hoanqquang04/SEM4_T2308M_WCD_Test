package com.example.examwcd.controller;

import com.example.examwcd.entities.PlayerIndex;
import com.example.examwcd.services.PlayerIndexService;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/index_player")
public class PlayerIndexController {
    @Autowired
    private PlayerIndexService playerIndexService;

    public PlayerIndexController() {
    }

    @GetMapping("/list")
    public List<PlayerIndex> findAll() {
        var player_index = playerIndexService.getPlayerIndexes();
        return player_index;
    }

    @PostMapping
    public void save(@RequestBody PlayerIndex playerIndex) {
        try {
            playerIndexService.addPlayerIndex(playerIndex);
            System.out.println("Added player index");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @PutMapping("edit/{id}")
    public void edit(@PathVariable int id, @RequestBody PlayerIndex playerIndex) {
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        playerIndexService.deletePlayerIndex(id);
        System.out.println("Deleted player index");
    }
}
