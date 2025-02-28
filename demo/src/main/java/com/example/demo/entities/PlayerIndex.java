package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class PlayerIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne
    @JoinColumn(name = "index_id", nullable = false)
    private Indexer indexer;

    @Column(nullable = false)
    private Double value;

    public PlayerIndex() {}

    public PlayerIndex(Long id, Player player, Indexer indexer, Double value) {
        this.id = id;
        this.player = player;
        this.indexer = indexer;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Indexer getIndexer() {
        return indexer;
    }

    public void setIndexer(Indexer indexer) {
        this.indexer = indexer;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        if (indexer != null) {
            if (value < indexer.getValueMin() || value > indexer.getValueMax()) {
                throw new IllegalArgumentException("Value must be within the allowed range!");
            }
        }
        this.value = value;
    }
}
