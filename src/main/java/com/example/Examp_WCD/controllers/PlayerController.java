package com.example.Examp_WCD.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examp_WCD.entities.Player;
import com.example.Examp_WCD.services.PlayerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers () {
        return playerService.getAllPlayer();
    }

    @PostMapping
    public Player addPlayer (@RequestBody Player player)
    {
        return playerService.addPlayer(player);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Integer playerId, @RequestBody Player player)
    {
        Player updatPlayer = playerService.updatePlayer(playerId, player);
        return (updatPlayer != null) ? ResponseEntity.ok(updatPlayer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Integer playerId) {
        return playerService.deletePlayer(playerId) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
    
    
}       
