package com.example.playerinformation.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "full_name", nullable = false, length = 128)
    private String fullName;

    @Column(name = "age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "index_id", nullable = false)
    private Indexer indexer;
}
