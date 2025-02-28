package com.example.demo.services;

import com.example.demo.entities.Player;

import java.util.List;


public interface IPlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(int id);
    Player savePlayer(Player player);
    void deletePlayer(int id);
}
