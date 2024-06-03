package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;

import java.util.List;

public interface DisposalGuidelineService {
    List<DisposalGuidelines> findAll();
    DisposalGuidelines findById(Long id);
    DisposalGuidelines save(DisposalGuidelines guideline);
    void delete(Long id);
}

