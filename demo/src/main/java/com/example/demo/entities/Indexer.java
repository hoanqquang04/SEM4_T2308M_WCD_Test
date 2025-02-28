package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indexId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double valueMin;

    @Column(nullable = false)
    private Double valueMax;

    public Indexer() {}

    public Indexer(Long indexId, String name, Double valueMin, Double valueMax) {
        this.indexId = indexId;
        this.name = name;
        this.valueMin = valueMin;
        this.valueMax = valueMax;
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValueMin() {
        return valueMin;
    }

    public void setValueMin(Double valueMin) {
        this.valueMin = valueMin;
    }

    public Double getValueMax() {
        return valueMax;
    }

    public void setValueMax(Double valueMax) {
        this.valueMax = valueMax;
    }
}
