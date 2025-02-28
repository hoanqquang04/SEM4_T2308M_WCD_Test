package com.example.playerinformation.service;

import com.example.playerinformation.entities.PlayerIndex;
import com.example.playerinformation.respository.PlayerIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerIndexService {

    @Autowired
    private PlayerIndexRepository playerIndexRepository;

    public List<PlayerIndex> getAllPlayerIndexes() {
        return playerIndexRepository.findAll();
    }

    public Optional<PlayerIndex> getPlayerIndexById(Long id) {
        return playerIndexRepository.findById(id);
    }

    public PlayerIndex createPlayerIndex(PlayerIndex playerIndex) {
        return playerIndexRepository.save(playerIndex);
    }

    public PlayerIndex updatePlayerIndex(Long id, PlayerIndex newPlayerIndex) {
        return playerIndexRepository.findById(id).map(playerIndex -> {
            playerIndex.setPlayer(newPlayerIndex.getPlayer());
            playerIndex.setIndexer(newPlayerIndex.getIndexer());
            playerIndex.setValue(newPlayerIndex.getValue());
            return playerIndexRepository.save(playerIndex);
        }).orElseThrow(() -> new RuntimeException("PlayerIndex not found"));
    }

    public void deletePlayerIndex(Long id) {
        playerIndexRepository.deleteById(id);
    }
}