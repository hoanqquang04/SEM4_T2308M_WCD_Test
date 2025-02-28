package com.example.exam.service;

import com.example.exam.entity.Player;
import com.example.exam.entity.PlayerIndex;
import com.example.exam.repository.IPlayerIndexRepository;
import com.example.exam.repository.IPlayerRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerIndexService {
    @Autowired
    private IPlayerIndexRepository playerIndexRepository;
    public List<PlayerIndex> getPlayerIndexAll() {
        return playerIndexRepository.findAll();
    }
    public PlayerIndex savePlayerIndex(PlayerIndex playerIndex) {
        return playerIndexRepository.save(playerIndex);
    }
    public PlayerIndex updatePlayerIndex(int id,PlayerIndex playerIndex) {
        playerIndex.setId(id);
        return playerIndexRepository.save(playerIndex);
    }
    public void deletePlayerIndex(int id) {
        playerIndexRepository.deleteById(id);
    }
}
