package com.enviro.assessment.grad001.khethukuthulasimamane.service.impl;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;
import com.enviro.assessment.grad001.khethukuthulasimamane.repository.WasteCategoryRepository;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enviro.assessment.grad001.khethukuthulasimamane.ErrorHandler.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing WasteCategory.
 */
@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {

    @Autowired
    private WasteCategoryRepository repository;

    @Override
    public List<WasteCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public WasteCategory findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("WasteCategory not found with id " + id));
    }

    @Override
    public WasteCategory save(WasteCategory category) {
        return repository.save(category);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}


