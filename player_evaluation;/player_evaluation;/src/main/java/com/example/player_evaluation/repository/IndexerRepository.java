package com.example.player_evaluation.repository;

import com.example.player_evaluation.model.Indexer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexerRepository extends JpaRepository<Indexer, Integer> {
}
