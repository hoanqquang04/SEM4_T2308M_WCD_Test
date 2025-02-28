package com.example.exam.controller;

import com.example.exam.entity.Player;
import com.example.exam.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
    @PostMapping("/create")
    public Player createPlayer(@RequestBody Player player) {
        try {
            playerService.savePlayer(player);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return player;
    }
    @PutMapping("/update/{id}")
    public Player updatePlayer(@PathVariable int id, @RequestBody Player player) {
        return playerService.updatePlayer(id, player);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable int id) {
        playerService.deletePlayer(id);
    }
}
