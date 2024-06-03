package com.enviro.assessment.grad001.khethukuthulasimamane.controller;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * This is a Waste Category Controller class
 * It handles all /api/waste-categories endpoints
 * It consists of 5 endpoint methods in total
 */
@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    // This method get all the waste categories for you in a list format
    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllWasteCategories() {
        List<WasteCategory> categories = wasteCategoryService.findAll();
        return ResponseEntity.ok(categories);
    }

    // This method allows you to get a specific waste category using id
    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getWasteCategoryById(@PathVariable Long id) {
        WasteCategory category = wasteCategoryService.findById(id);
        return ResponseEntity.ok(category);
    }

    // This method allows you to add a specific waste category
    @PostMapping
    public ResponseEntity<WasteCategory> createWasteCategory(@Valid @RequestBody WasteCategory category) {
        WasteCategory createdCategory = wasteCategoryService.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }

    // This method allows you to update a specific waste category data using id
    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateWasteCategory(@PathVariable Long id, @Valid @RequestBody WasteCategory category) {
        category.setId(id);
        WasteCategory updatedCategory = wasteCategoryService.save(category);
        return ResponseEntity.ok(updatedCategory);
    }

    // This method allows you to delete a specific waste category using id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

