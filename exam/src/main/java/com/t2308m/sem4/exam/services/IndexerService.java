package com.t2308m.sem4.exam.services;

import com.t2308m.sem4.exam.entities.Indexer;
import com.t2308m.sem4.exam.repositories.IndexerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndexerService implements IndexerServiceInterface {

    @Autowired
    private IndexerRepository indexerRepository;

    @Override
    public List<Indexer> getAllIndexers() {
        return indexerRepository.findAll();
    }

    @Override
    public Optional<Indexer> getIndexerById(Integer id) {
        return indexerRepository.findById(id);
    }

    @Override
    public Indexer saveIndexer(Indexer indexer) {
        return indexerRepository.save(indexer);
    }

    @Override
    public void deleteIndexer(Integer id) {
        indexerRepository.deleteById(id);
    }
}