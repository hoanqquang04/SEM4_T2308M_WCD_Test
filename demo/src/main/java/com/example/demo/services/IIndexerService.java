package com.example.demo.services;


import com.example.demo.entities.Indexer;

import java.util.List;

public interface IIndexerService {
    List<Indexer> getAllIndexers();
    Indexer getIndexerById(int id);
    Indexer saveIndexer(Indexer indexer);
    void deleteIndexer(int id);
}
