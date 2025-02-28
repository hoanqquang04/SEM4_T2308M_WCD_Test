package com.example.Examp_WCD.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer indexId;
    private String name;
    private float valueMin;
    private float valueMax;
}

