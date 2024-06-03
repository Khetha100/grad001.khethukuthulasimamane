package com.enviro.assessment.grad001.khethukuthulasimamane.controller;


import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.RecyclingTipsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipsController {

    @Autowired
    private RecyclingTipsService recyclingTipsService;

    @GetMapping
    public ResponseEntity<List<RecyclingTips>> getAllRecyclingTips() {
        List<RecyclingTips> tips = recyclingTipsService.findAll();
        return ResponseEntity.ok(tips);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTips> getRecyclingTipById(@PathVariable Long id) {
        RecyclingTips tip = recyclingTipsService.findById(id);
        return ResponseEntity.ok(tip);
    }

    @PostMapping
    public ResponseEntity<RecyclingTips> createRecyclingTip(@Valid @RequestBody RecyclingTips tip) {
        RecyclingTips createdTip = recyclingTipsService.save(tip);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTips> updateRecyclingTip(@PathVariable Long id, @Valid @RequestBody RecyclingTips tip) {
        tip.setId(id);
        RecyclingTips updatedTip = recyclingTipsService.save(tip);
        return ResponseEntity.ok(updatedTip);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        recyclingTipsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

