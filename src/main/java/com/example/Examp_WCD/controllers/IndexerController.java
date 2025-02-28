package com.example.Examp_WCD.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examp_WCD.entities.Indexer;
import com.example.Examp_WCD.services.IndexerService;

@RestController
@RequestMapping("/api/indexers")
public class IndexerController {
    @Autowired
    private IndexerService indexerService;

    @GetMapping
    public List<Indexer> getAllIndexers ()
    {
        return indexerService.getAllIndexer();
    }

    @PostMapping
    public Indexer addIndexer (@RequestBody Indexer indexer) 
    {
        return indexerService.addIndexer(indexer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Indexer> updateIndexer(@PathVariable Integer indexerId, @RequestBody Indexer indexer)
    {
        Indexer updateIndexer = indexerService.updateIndexer(indexerId, indexer);
        return (updateIndexer != null) ? ResponseEntity.ok(updateIndexer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndexer(@PathVariable Integer indexerId) {
        return indexerService.deleteIndexer(indexerId) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
