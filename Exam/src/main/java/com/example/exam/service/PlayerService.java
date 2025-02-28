package com.example.exam.service;

import com.example.exam.entity.Player;
import com.example.exam.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private IPlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }
    public Player updatePlayer(int id, Player player) {
       player.setPlayerId(id);
       return playerRepository.save(player);
    }
    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }
}

