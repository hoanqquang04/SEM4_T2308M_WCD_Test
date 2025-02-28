package com.t2308m.sem4.exam.services;

import com.t2308m.sem4.exam.entities.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {

    List<Player> getAllPlayers();

    Optional<Player> getPlayerById(Integer id);

    Player savePlayer(Player player);

    void deletePlayer(Integer id);
}