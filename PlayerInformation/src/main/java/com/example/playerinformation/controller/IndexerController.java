package com.example.playerinformation.controller;

import com.example.playerinformation.entities.Indexer;
import com.example.playerinformation.service.IndexerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/indexers")
@CrossOrigin("*")
public class IndexerController {

    @Autowired
    private IndexerService indexerService;

    @GetMapping
    public List<Indexer> getAllIndexers() {
        return indexerService.getAllIndexers();
    }

    @GetMapping("/{index_id}")
    public Optional<Indexer> getIndexerById(@PathVariable Long index_id) {
        return indexerService.getIndexerById(index_id);
    }

    @PostMapping
    public Indexer createIndexer(@RequestBody Indexer indexer) {
        return indexerService.createIndexer(indexer);
    }

    @PutMapping("/{index_id}")
    public Indexer updateIndexer(@PathVariable Long index_id, @RequestBody Indexer indexer) {
        return indexerService.updateIndexer(index_id, indexer);
    }

    @DeleteMapping("/{index_id}")
    public void deleteIndexer(@PathVariable Long index_id) {
        indexerService.deleteIndexer(index_id);
    }
}