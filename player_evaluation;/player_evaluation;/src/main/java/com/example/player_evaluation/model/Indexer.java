package com.example.player_evaluation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "indexer")
public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer indexId;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false)
    private Float valueMin;

    @Column(nullable = false)
    private Float valueMax;
}
