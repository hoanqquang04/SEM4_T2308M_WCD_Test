package com.example.demo.services;

import com.example.demo.entities.Indexer;
import com.example.demo.repository.IIndexerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IndexerService implements IIndexerService {
    private final IIndexerRepository indexerRepository;

    public IndexerService(IIndexerRepository indexerRepository) {
        this.indexerRepository = indexerRepository;
    }

    @Override
    public List<Indexer> getAllIndexers() {
        return indexerRepository.findAll();
    }

    @Override
    public Indexer getIndexerById(int id) {
        return indexerRepository.findById(id).orElse(null);
    }

    @Override
    public Indexer saveIndexer(Indexer indexer) {
        return indexerRepository.save(indexer);
    }

    @Override
    public void deleteIndexer(int id) {
        indexerRepository.deleteById(id);
    }
}
