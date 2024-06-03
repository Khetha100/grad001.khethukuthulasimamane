package com.enviro.assessment.grad001.khethukuthulasimamane.repository;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing WasteCategory entities.
 */
@Repository
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {

}
