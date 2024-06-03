package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;

import java.util.List;

/**
 * Service interface for managing DisposalGuidelines.
 */
public interface DisposalGuidelineService {

    /**
     * Retrieves all disposal guidelines.
     *
     * @return a list of all disposal guidelines
     */
    List<DisposalGuidelines> findAll();

    /**
     * Retrieves a disposal guideline by its ID.
     *
     * @param id the ID of the disposal guideline to retrieve
     * @return the disposal guideline with the specified ID, or null if not found
     */
    DisposalGuidelines findById(Long id);

    /**
     * Saves a disposal guideline.
     *
     * @param guideline the disposal guideline to save
     * @return the saved disposal guideline
     */
    DisposalGuidelines save(DisposalGuidelines guideline);

    /**
     * Deletes a disposal guideline by its ID.
     *
     * @param id the ID of the disposal guideline to delete
     */
    void delete(Long id);
}

