package com.example.exam.repository;

import com.example.exam.entity.PlayerIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerIndexRepository extends JpaRepository<PlayerIndex, Integer> {
}
