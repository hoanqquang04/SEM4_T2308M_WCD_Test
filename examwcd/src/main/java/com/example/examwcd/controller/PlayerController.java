package com.example.examwcd.controller;

import com.example.examwcd.entities.Player;
import com.example.examwcd.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    public PlayerController() {
    }
    @GetMapping("/list")
    public List<Player> findAll() {
        var players = playerService.getAllPlayers();
        return players;
    }

    @PostMapping("/add")
    public void addPlayer(@RequestBody Player player) {
        try {
            playerService.addPlayer(player);
            System.out.println("add player success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("edit/{id}")
    public void editPlayer(@PathVariable Long id, @RequestBody Player player) {
        try {
            playerService.updatePlayer(id, player);
            System.out.println("edit player success");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @DeleteMapping
    public void deletePlayer(@PathVariable Long id) {
        try {
            playerService.deletePlayer(id);
            System.out.println("delete player success");
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
