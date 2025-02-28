package com.t2308m.sem4.exam.services;

import com.t2308m.sem4.exam.entities.PlayerIndex;

import java.util.List;
import java.util.Optional;

public interface IPlayerIndexService {

    List<PlayerIndex> getAllPlayerIndexes();

    Optional<PlayerIndex> getPlayerIndexById(Integer id);

    PlayerIndex savePlayerIndex(PlayerIndex playerIndex);

    void deletePlayerIndex(Integer id);
}