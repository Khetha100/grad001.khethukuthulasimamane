package com.enviro.assessment.grad001.khethukuthulasimamane.controller;


import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.DisposalGuidelineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is a Disposal Guidelines Controller class
 * It handles all /api/disposal-guidelines endpoints
 * It consists of 5 endpoint methods in total
 */
@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelinesController {

    @Autowired
    private DisposalGuidelineService disposalGuidelineService;

    // This method get all the Disposal guidelines for you in  list format
    @GetMapping
    public ResponseEntity<List<DisposalGuidelines>> getAllDisposalGuidelines() {
        List<DisposalGuidelines> guidelines = disposalGuidelineService.findAll();
        return ResponseEntity.ok(guidelines);
    }

    // This method get for you a single disposal guideline by id
    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> getDisposalGuidelineById(@PathVariable Long id) {
        DisposalGuidelines guideline = disposalGuidelineService.findById(id);
        return ResponseEntity.ok(guideline);
    }

    // This method lets you post disposal guideline
    @PostMapping
    public ResponseEntity<DisposalGuidelines> createDisposalGuideline(@Valid @RequestBody DisposalGuidelines guideline) {
        DisposalGuidelines createdGuideline = disposalGuidelineService.save(guideline);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGuideline);
    }

    // This method let you update a specific disposal guideline using id
    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> updateDisposalGuideline(@PathVariable Long id, @Valid @RequestBody DisposalGuidelines guideline) {
        guideline.setId(id);
        DisposalGuidelines updatedGuideline = disposalGuidelineService.save(guideline);
        return ResponseEntity.ok(updatedGuideline);
    }

    // This method let you delete a specific disposal guideline using id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisposalGuideline(@PathVariable Long id) {
        disposalGuidelineService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
