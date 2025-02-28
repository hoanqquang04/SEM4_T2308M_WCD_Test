package com.example.Examp_WCD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Examp_WCD.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
