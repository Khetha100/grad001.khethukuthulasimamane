package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;

import java.util.List;

public interface WasteCategoryService {
    List<WasteCategory> findAll();
    WasteCategory findById(Long id);
    WasteCategory save(WasteCategory category);
    void delete(Long id);
}


