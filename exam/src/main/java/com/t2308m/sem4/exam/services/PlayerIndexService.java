package com.t2308m.sem4.exam.services;

import com.t2308m.sem4.exam.entities.PlayerIndex;
import com.t2308m.sem4.exam.repositories.PlayerIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerIndexService implements IPlayerIndexService {

    @Autowired
    private PlayerIndexRepository playerIndexRepository;

    @Override
    public List<PlayerIndex> getAllPlayerIndexes() {
        return playerIndexRepository.findAll();
    }

    @Override
    public Optional<PlayerIndex> getPlayerIndexById(Integer id) {
        return playerIndexRepository.findById(id);
    }

    @Override
    public PlayerIndex savePlayerIndex(PlayerIndex playerIndex) {
        return playerIndexRepository.save(playerIndex);
    }

    @Override
    public void deletePlayerIndex(Integer id) {
        playerIndexRepository.deleteById(id);
    }
}