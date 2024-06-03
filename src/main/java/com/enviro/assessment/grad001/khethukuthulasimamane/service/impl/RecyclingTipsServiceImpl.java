package com.enviro.assessment.grad001.khethukuthulasimamane.service.impl;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.khethukuthulasimamane.repository.RecyclingTipsRepository;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.RecyclingTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enviro.assessment.grad001.khethukuthulasimamane.ErrorHandler.ResourceNotFoundException;

import java.util.List;

@Service
public class RecyclingTipsServiceImpl implements RecyclingTipsService {

    @Autowired
    private RecyclingTipsRepository repository;

    @Override
    public List<RecyclingTips> findAll() {
        return repository.findAll();
    }

    @Override
    public RecyclingTips findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RecyclingTip not found with id " + id));
    }

    @Override
    public RecyclingTips save(RecyclingTips tip) {
        return repository.save(tip);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

