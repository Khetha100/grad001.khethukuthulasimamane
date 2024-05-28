package com.enviro.assessment.grad001.khethukuthulasimamane.service.impl;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;
import com.enviro.assessment.grad001.khethukuthulasimamane.repository.WasteCategoryRepository;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {

    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    @Override
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryRepository.findAll();
    }

    @Override
    public WasteCategory getWasteCategoryById(Long id) {
        Optional<WasteCategory> optionalWasteCategory = wasteCategoryRepository.findById(id);
        return optionalWasteCategory.orElse(null);
    }

    @Override
    public WasteCategory createWasteCategory(WasteCategory wasteCategory) {
        return wasteCategoryRepository.save(wasteCategory);
    }

    @Override
    public WasteCategory updateWasteCategory(Long id, WasteCategory wasteCategory) {
        if (wasteCategoryRepository.existsById(id)) {
            wasteCategory.setId(id);
            return wasteCategoryRepository.save(wasteCategory);
        }
        return null;
    }

    @Override
    public void deleteWasteCategory(Long id) {
        wasteCategoryRepository.deleteById(id);
    }
}

