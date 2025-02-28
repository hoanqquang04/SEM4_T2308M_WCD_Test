package com.example.playerinformation.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_index")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PlayerIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "index_id", nullable = false)
    private Indexer index_id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player_id;

    @Column(name = "value", nullable = false)
    private float value;
}
