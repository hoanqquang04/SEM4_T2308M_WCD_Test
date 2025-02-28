package com.example.examwcd.services;

import com.example.examwcd.entities.PlayerIndex;

import java.util.List;

public interface IPlayerIndexerService {
    List<PlayerIndex> getPlayerIndexes();
    void addPlayerIndex(PlayerIndex playerIndex);
    void updatePlayerIndex(PlayerIndex playerIndex, Long id);
    void deletePlayerIndex(Long id);
}
