package com.enviro.assessment.grad001.khethukuthulasimamane.controller;


import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.DisposalGuidelineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelinesController {

    @Autowired
    private DisposalGuidelineService disposalGuidelineService;

    @GetMapping
    public ResponseEntity<List<DisposalGuidelines>> getAllDisposalGuidelines() {
        List<DisposalGuidelines> guidelines = disposalGuidelineService.findAll();
        return ResponseEntity.ok(guidelines);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> getDisposalGuidelineById(@PathVariable Long id) {
        DisposalGuidelines guideline = disposalGuidelineService.findById(id);
        return ResponseEntity.ok(guideline);
    }

    @PostMapping
    public ResponseEntity<DisposalGuidelines> createDisposalGuideline(@Valid @RequestBody DisposalGuidelines guideline) {
        DisposalGuidelines createdGuideline = disposalGuidelineService.save(guideline);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGuideline);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> updateDisposalGuideline(@PathVariable Long id, @Valid @RequestBody DisposalGuidelines guideline) {
        guideline.setId(id);
        DisposalGuidelines updatedGuideline = disposalGuidelineService.save(guideline);
        return ResponseEntity.ok(updatedGuideline);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisposalGuideline(@PathVariable Long id) {
        disposalGuidelineService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
