package com.example.player_evaluation.repository;

import com.example.player_evaluation.model.PlayerIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerIndexRepository extends JpaRepository<PlayerIndex, Integer> {
}
