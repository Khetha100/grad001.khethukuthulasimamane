package com.enviro.assessment.grad001.khethukuthulasimamane.repository;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing DisposalGuidelines entities.
 */
@Repository
public interface DisposalGuidelinesRepository extends JpaRepository<DisposalGuidelines, Long> {
}
