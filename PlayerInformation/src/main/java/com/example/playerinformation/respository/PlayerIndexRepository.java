package com.example.playerinformation.respository;

import com.example.playerinformation.entities.PlayerIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerIndexRepository extends JpaRepository<PlayerIndex, Long> {
}