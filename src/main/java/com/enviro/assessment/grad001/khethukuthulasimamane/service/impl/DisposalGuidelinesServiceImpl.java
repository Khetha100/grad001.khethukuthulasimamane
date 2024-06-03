package com.enviro.assessment.grad001.khethukuthulasimamane.service.impl;


import com.enviro.assessment.grad001.khethukuthulasimamane.ErrorHandler.ResourceNotFoundException;
import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.khethukuthulasimamane.repository.DisposalGuidelinesRepository;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.DisposalGuidelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for managing DisposalGuidelines.
 */
@Service
public class DisposalGuidelinesServiceImpl implements DisposalGuidelineService {

    @Autowired
    private DisposalGuidelinesRepository repository;

    @Override
    public List<DisposalGuidelines> findAll() {
        return repository.findAll();
    }

    @Override
    public DisposalGuidelines findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("DisposalGuideline not found with id " + id));
    }

    @Override
    public DisposalGuidelines save(DisposalGuidelines guideline) {
        return repository.save(guideline);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

