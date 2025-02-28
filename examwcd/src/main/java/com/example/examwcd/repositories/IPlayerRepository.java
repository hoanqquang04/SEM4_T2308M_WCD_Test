package com.example.examwcd.repositories;

import com.example.examwcd.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPlayerRepository extends JpaRepository<Player, Long> {

}
