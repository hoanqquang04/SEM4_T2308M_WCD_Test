package com.example.playerinformation.controller;

import com.example.playerinformation.entities.PlayerIndex;
import com.example.playerinformation.service.PlayerIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/player-indexes")
@CrossOrigin("*") // Cho phép gọi API từ frontend
public class PlayerIndexController {

    @Autowired
    private PlayerIndexService playerIndexService;

    @GetMapping
    public List<PlayerIndex> getAllPlayerIndexes() {
        return playerIndexService.getAllPlayerIndexes();
    }

    @GetMapping("/{id}")
    public Optional<PlayerIndex> getPlayerIndexById(@PathVariable Long id) {
        return playerIndexService.getPlayerIndexById(id);
    }

    @PostMapping
    public PlayerIndex createPlayerIndex(@RequestBody PlayerIndex playerIndex) {
        return playerIndexService.createPlayerIndex(playerIndex);
    }

    @PutMapping("/{id}")
    public PlayerIndex updatePlayerIndex(@PathVariable Long id, @RequestBody PlayerIndex playerIndex) {
        return playerIndexService.updatePlayerIndex(id, playerIndex);
    }

    @DeleteMapping("/{id}")
    public void deletePlayerIndex(@PathVariable Long id) {
        playerIndexService.deletePlayerIndex(id);
    }
}