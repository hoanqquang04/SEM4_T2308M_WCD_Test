package com.example.examwcd.services;
import com.example.examwcd.entities.Player;
import java.util.List;

public interface IPlayerService {
    public List<Player> getAllPlayers();
    void addPlayer(Player player);
    void updatePlayer(Long id, Player player);
    void deletePlayer(Long id);


}
