package com.example.examwcd.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "player_index")
public class PlayerIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "player_id")
    private int playerId;
    @Column(name = "indexer_id")
    private int indexerId;
    @Column(name = "value")
    private int value;

    public PlayerIndex() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getIndexerId() {
        return indexerId;
    }

    public void setIndexerId(int indexerId) {
        this.indexerId = indexerId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
