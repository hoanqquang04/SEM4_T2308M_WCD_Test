package com.example.exam.controller;

import com.example.exam.entity.PlayerIndex;
import com.example.exam.service.IndexerService;
import com.example.exam.service.PlayerIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexerController {
    @Autowired
    private IndexerService indexerService;
    @GetMapping
   
}
