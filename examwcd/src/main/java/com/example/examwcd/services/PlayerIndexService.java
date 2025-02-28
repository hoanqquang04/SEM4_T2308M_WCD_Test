package com.example.examwcd.services;

import com.example.examwcd.entities.PlayerIndex;
import com.example.examwcd.repositories.IPlayerIndexerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PlayerIndexService implements IPlayerIndexerService{
    @Autowired
    private IPlayerIndexerRepository playerIndexerRepository;
    @Override
    public List<PlayerIndex> getPlayerIndexes() {
        var items = playerIndexerRepository.findAll();
        return items;
    }

    @Override
    @Transactional
    public void addPlayerIndex(PlayerIndex playerIndex) {
        try {
            playerIndexerRepository.save(playerIndex);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlayerIndex(PlayerIndex playerIndex, Long id) {
        try {
            var existingPlayerIndex = playerIndexerRepository.findById(id);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePlayerIndex(Long id) {
        try {
            playerIndexerRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
