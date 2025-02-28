package com.t2308m.sem4.exam.services;

import com.t2308m.sem4.exam.entities.Indexer;

import java.util.List;
import java.util.Optional;

public interface IndexerServiceInterface {

    List<Indexer> getAllIndexers();

    Optional<Indexer> getIndexerById(Integer id);

    Indexer saveIndexer(Indexer indexer);

    void deleteIndexer(Integer id);
}