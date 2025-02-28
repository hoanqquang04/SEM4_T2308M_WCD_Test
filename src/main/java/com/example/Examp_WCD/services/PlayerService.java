package com.example.Examp_WCD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examp_WCD.entities.Player;
import com.example.Examp_WCD.repositories.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayer () 
    {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Integer playerId) {
        return playerRepository.findById(playerId);
    }

    public Player addPlayer (Player player)
    {
        return playerRepository.save(player);
    }

    public Player updatePlayer (Integer playerId, Player newPlayer)
    {
        return playerRepository.findById(playerId)
                               .map(player -> {
                                    player.setName(newPlayer.getName());
                                    player.setFullName(newPlayer.getFullName());
                                    player.setAge(newPlayer.getAge());
                                    return playerRepository.save(player);
                               }).orElse(null);
                               
    }

    public boolean deletePlayer (Integer playerId)
    {
        if (playerRepository.existsById(playerId))
        {
            playerRepository.deleteById(playerId);;
            return true;
        }
        return false;
    }
}
