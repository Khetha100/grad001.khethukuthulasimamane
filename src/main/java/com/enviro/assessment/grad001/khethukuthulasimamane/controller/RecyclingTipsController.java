package com.enviro.assessment.grad001.khethukuthulasimamane.controller;


import com.enviro.assessment.grad001.khethukuthulasimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.khethukuthulasimamane.service.RecyclingTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipsController {

    @Autowired
    private RecyclingTipsService wasteCategoryService;

    @GetMapping
    public List<RecyclingTips> getAllRecycleTips() {
        return wasteCategoryService.getAllRecycleTips();
    }

}
