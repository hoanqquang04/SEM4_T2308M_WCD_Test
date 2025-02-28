package com.example.demo.controller;



import com.example.demo.entities.Indexer;
import com.example.demo.services.IIndexerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/indexers")
public class IndexerController {
    private final IIndexerService indexerService;

    public IndexerController(IIndexerService indexerService) {
        this.indexerService = indexerService;
    }

    @GetMapping
    public List<Indexer> getAllIndexers() {
        return indexerService.getAllIndexers();
    }

    @GetMapping("/{id}")
    public Indexer getIndexerById(@PathVariable int id) {
        return indexerService.getIndexerById(id);
    }

    @PostMapping
    public Indexer createIndexer(@RequestBody Indexer indexer) {
        return indexerService.saveIndexer(indexer);
    }

    @DeleteMapping("/{id}")
    public void deleteIndexer(@PathVariable int id) {
        indexerService.deleteIndexer(id);
    }
}
