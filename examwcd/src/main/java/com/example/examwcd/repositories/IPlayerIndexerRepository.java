package com.example.examwcd.repositories;

import com.example.examwcd.entities.PlayerIndex;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerIndexerRepository extends JpaRepository<PlayerIndex, Long> {
}
