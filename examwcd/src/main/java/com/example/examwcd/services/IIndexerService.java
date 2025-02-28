package com.example.examwcd.services;

import com.example.examwcd.entities.Indexer;

import java.util.List;

public interface IIndexerService {
    List<Indexer> getAllIndexers();
    void addIndexer(Indexer indexer);
    void updateIndexer(Indexer indexer, Long id);
    void deleteIndexer(Long id);
}
