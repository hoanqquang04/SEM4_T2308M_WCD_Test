package com.example.playerinformation.respository;

import com.example.playerinformation.entities.Indexer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexerRepository extends JpaRepository<Indexer, Long> {
}

