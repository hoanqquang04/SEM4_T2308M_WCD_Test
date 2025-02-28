package com.example.exam.service;

import com.example.exam.entity.Indexer;
import com.example.exam.repository.IIndexerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexerService {
    @Autowired
    private IIndexerRepository indexerRepository;
    public List<Indexer> getAllIndexers() {
        return indexerRepository.findAll();
    }
    public Indexer saveIndexer(Indexer indexer) {
        return indexerRepository.save(indexer);
    }

    public Indexer updateIndexer(int indexId,Indexer indexer) {
        indexer.setIndexId(indexId);
        return indexerRepository.save(indexer);
    }
    public void deleteIndexer(int indexId) {
        indexerRepository.deleteById(indexId);
    }
}
