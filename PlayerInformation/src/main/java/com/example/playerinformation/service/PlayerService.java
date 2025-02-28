package com.example.playerinformation.service;

import com.example.playerinformation.entities.Player;
import com.example.playerinformation.respository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long player_id) {
        return playerRepository.findById(player_id);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long player_id, Player newPlayer) {
        return playerRepository.findById(player_id).map(player -> {
            player.setName(newPlayer.getName());
            player.setFullName(newPlayer.getFullName());
            player.setAge(newPlayer.getAge());
            player.setIndexer(newPlayer.getIndexer());
            return playerRepository.save(player);
        }).orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public void deletePlayer(Long player_id) {
        playerRepository.deleteById(player_id);
    }
}
