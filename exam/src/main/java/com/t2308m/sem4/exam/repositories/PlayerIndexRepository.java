package com.t2308m.sem4.exam.repositories;

import com.t2308m.sem4.exam.entities.PlayerIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerIndexRepository extends JpaRepository<PlayerIndex, Integer> {
}