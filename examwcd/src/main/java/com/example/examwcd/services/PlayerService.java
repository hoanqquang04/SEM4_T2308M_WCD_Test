package com.example.examwcd.services;

import com.example.examwcd.entities.Player;
import com.example.examwcd.repositories.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PlayerService implements IPlayerService {
    @Autowired
    private IPlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        var players = playerRepository.findAll();
        return players;
    }

    @Override
    public void addPlayer(Player player) {
        try {
            playerRepository.save(player);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlayer(Long id, Player player) {
        try {
            var existingPlayer = playerRepository.findAllById(id);




        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePlayer(Long id) {
        try {
            playerRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
