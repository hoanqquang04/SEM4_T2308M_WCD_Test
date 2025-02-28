package com.example.playerinformation.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Indexer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "valueMin", nullable = false)
    private float valueMin;

    @Column(name = "valueMax", nullable = false)
    private float valueMax;
}
