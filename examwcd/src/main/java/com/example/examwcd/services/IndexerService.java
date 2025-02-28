package com.example.examwcd.services;

import com.example.examwcd.entities.Indexer;
import com.example.examwcd.repositories.IIndexerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexerService implements IIndexerService {
    @Autowired
    private IIndexerRepository indexerRepository;


    @Override
    public List<Indexer> getAllIndexers() {
        var indexers = indexerRepository.findAll();
        return indexers;
    }

    @Override
    @Transactional
    public void addIndexer(Indexer indexer) {
        indexerRepository.save(indexer);
    }

    @Override
    public void updateIndexer(Indexer indexer, Long id) {

    }

    @Override
    public void deleteIndexer(Long id) {
        try {
            indexerRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
