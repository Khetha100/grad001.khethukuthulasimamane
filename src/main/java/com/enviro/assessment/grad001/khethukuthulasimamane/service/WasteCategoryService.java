package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;

import java.util.List;

public interface WasteCategoryService {
    List<WasteCategory> getAllWasteCategories();
    WasteCategory getWasteCategoryById(Long id);
    WasteCategory createWasteCategory(WasteCategory wasteCategory);
    WasteCategory updateWasteCategory(Long id, WasteCategory wasteCategory);
    void deleteWasteCategory(Long id);
}

