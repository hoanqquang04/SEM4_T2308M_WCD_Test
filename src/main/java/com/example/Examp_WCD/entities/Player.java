package com.example.Examp_WCD.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;
    private String name;
    private String fullName;
    private String age;
    
    @ManyToOne
    @JoinColumn(name = "index_id")
    private Indexer indexer;
}

