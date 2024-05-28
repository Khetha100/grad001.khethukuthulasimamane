package com.enviro.assessment.grad001.khethukuthulasimamane.model;

import lombok.Data;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String disposalGuidelines;

    @NotNull
    private String recyclingTips;
}

