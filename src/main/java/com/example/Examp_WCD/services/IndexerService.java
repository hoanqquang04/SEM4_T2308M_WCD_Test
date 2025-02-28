package com.example.Examp_WCD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examp_WCD.entities.Indexer;
import com.example.Examp_WCD.repositories.IndexerRepository;

@Service
public class IndexerService {
    @Autowired
    private IndexerRepository indexerRepository;

    public List<Indexer> getAllIndexer () 
    {
        return indexerRepository.findAll();
    }

    public Indexer addIndexer (Indexer indexer) 
    {
        return indexerRepository.save(indexer);
    }

    public Indexer updateIndexer (Integer indexId, Indexer newIndexer)
    {
        return indexerRepository.findById(indexId)
                                .map (indexer -> 
                                {
                                    indexer.setName(newIndexer.getName());
                                    indexer.setValueMax(newIndexer.getValueMax());
                                    indexer.setValueMin(newIndexer.getValueMin());
                                    return indexerRepository.save(indexer);
                                }).orElse(null);
    }

    public boolean deleteIndexer (Integer indexerId)
    {
        if (indexerRepository.existsById(indexerId))
        {
            indexerRepository.deleteById(indexerId);
            return true;
        }
        
        return false;
    }
}
