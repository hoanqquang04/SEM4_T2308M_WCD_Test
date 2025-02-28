package com.t2308m.sem4.exam.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "player_index")
public class PlayerIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne
    @JoinColumn(name = "index_id", nullable = false)
    private Indexer indexer;

    @Column(nullable = false)
    private Float value;

    public PlayerIndex(Player player, Indexer indexer, Float value) {
        this.player = player;
        this.indexer = indexer;
        this.value = value;
    }

    public PlayerIndex() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}