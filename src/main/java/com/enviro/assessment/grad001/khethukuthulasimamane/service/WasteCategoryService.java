package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;

import java.util.List;

/**
 * Service interface for managing WasteCategory.
 */
public interface WasteCategoryService {

    /**
     * Retrieves all waste categories.
     *
     * @return a list of all waste categories
     */
    List<WasteCategory> findAll();

    /**
     * Retrieves a waste category by its ID.
     *
     * @param id the ID of the waste category to retrieve
     * @return the waste category with the specified ID, or null if not found
     */
    WasteCategory findById(Long id);

    /**
     * Saves a waste category.
     *
     * @param category the waste category to save
     * @return the saved waste category
     */
    WasteCategory save(WasteCategory category);

    /**
     * Deletes a waste category by its ID.
     *
     * @param id the ID of the waste category to delete
     */
    void delete(Long id);
}


