package com.enviro.assessment.grad001.khethukuthulasimamane.repository;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing RecyclingTips entities.
 */
@Repository
public interface RecyclingTipsRepository extends JpaRepository<RecyclingTips, Long> {
}
