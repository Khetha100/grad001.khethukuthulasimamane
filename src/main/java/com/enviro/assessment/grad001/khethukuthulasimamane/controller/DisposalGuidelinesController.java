package com.enviro.assessment.grad001.khethukuthulasimamane.controller;


import com.enviro.assessment.grad001.khethukuthulasimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.DisposalGuidelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/disposal-guideline")
public class DisposalGuidelinesController {

    @Autowired
    DisposalGuidelineService disposalGuidelineService;

    @GetMapping
    public List<DisposalGuidelines> getAllDisposalGuidelines() {
        return disposalGuidelineService.getAllDisposalGuidelines();
    }


}
