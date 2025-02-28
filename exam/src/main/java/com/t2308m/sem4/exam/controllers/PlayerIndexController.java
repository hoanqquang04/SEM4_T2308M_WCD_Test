package com.t2308m.sem4.exam.controllers;

import com.t2308m.sem4.exam.entities.PlayerIndex;
import com.t2308m.sem4.exam.services.IPlayerIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/player-indexes")
public class PlayerIndexController {

    @Autowired
    private IPlayerIndexService playerIndexService;

    @GetMapping
    public List<PlayerIndex> getAllPlayerIndexes() {
        return playerIndexService.getAllPlayerIndexes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerIndex> getPlayerIndexById(@PathVariable Integer id) {
        Optional<PlayerIndex> playerIndex = playerIndexService.getPlayerIndexById(id);
        return playerIndex.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PlayerIndex createPlayerIndex(@RequestBody PlayerIndex playerIndex) {
        return playerIndexService.savePlayerIndex(playerIndex);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerIndex> updatePlayerIndex(@PathVariable Integer id, @RequestBody PlayerIndex playerIndex) {
        playerIndex.setId(id);
        PlayerIndex updatedPlayerIndex = playerIndexService.savePlayerIndex(playerIndex);
        return ResponseEntity.ok(updatedPlayerIndex);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerIndex(@PathVariable Integer id) {
        playerIndexService.deletePlayerIndex(id);
        return ResponseEntity.noContent().build();
    }
}