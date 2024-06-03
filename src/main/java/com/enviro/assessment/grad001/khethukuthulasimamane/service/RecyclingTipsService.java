package com.enviro.assessment.grad001.khethukuthulasimamane.service;

import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;

import java.util.List;

public interface RecyclingTipsService {
    List<RecyclingTips> findAll();
    RecyclingTips findById(Long id);
    RecyclingTips save(RecyclingTips tip);
    void delete(Long id);
}

