package com.t2308m.sem4.exam.controllers;

import com.t2308m.sem4.exam.entities.Indexer;
import com.t2308m.sem4.exam.services.IndexerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/indexers")
public class IndexerController {

    @Autowired
    private IndexerServiceInterface indexerService;

    @GetMapping
    public List<Indexer> getAllIndexers() {
        return indexerService.getAllIndexers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Indexer> getIndexerById(@PathVariable Integer id) {
        Optional<Indexer> indexer = indexerService.getIndexerById(id);
        return indexer.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Indexer createIndexer(@RequestBody Indexer indexer) {
        return indexerService.saveIndexer(indexer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Indexer> updateIndexer(@PathVariable Integer id, @RequestBody Indexer indexer) {
        indexer.setIndexId(id);
        Indexer updatedIndexer = indexerService.saveIndexer(indexer);
        return ResponseEntity.ok(updatedIndexer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndexer(@PathVariable Integer id) {
        indexerService.deleteIndexer(id);
        return ResponseEntity.noContent().build();
    }
}