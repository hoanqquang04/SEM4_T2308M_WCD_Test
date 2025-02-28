package com.example.playerinformation.service;

import com.example.playerinformation.entities.Indexer;
import com.example.playerinformation.respository.IndexerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IndexerService {

    @Autowired
    private IndexerRepository indexerRepository;

    public List<Indexer> getAllIndexers() {
        return indexerRepository.findAll();
    }

    public Optional<Indexer> getIndexerById(Long index_id) {
        return indexerRepository.findById(index_id);
    }

    public Indexer createIndexer(Indexer indexer) {
        return indexerRepository.saveIndexer(indexer);
    }

    public Indexer updateIndexer(Long index_id, Indexer newIndexer) {
        return indexerRepository.findById(index_id).map(indexer -> {
            indexer.setName(newIndexer.getName());
            indexer.setValueMin(newIndexer.getValueMin());
            indexer.setValueMax(newIndexer.getValueMax());
            return indexerRepository.save(indexer);
        }).orElseThrow(() -> new RuntimeException("Indexer not found"));
    }

    public void deleteIndexer(Long index_id) {
        indexerRepository.deleteById(index_id);
    }
}
