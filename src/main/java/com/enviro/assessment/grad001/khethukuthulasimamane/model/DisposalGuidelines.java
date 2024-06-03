package com.enviro.assessment.grad001.khethukuthulasimamane.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "disposal_guidelines")
@NoArgsConstructor
@AllArgsConstructor
public class DisposalGuidelines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "waste_id")
    private WasteCategory waste;

    @NotNull
    @Column(name = "disposal_tips")
    private String disposalSteps;

    @NotNull
    @Column(name = "guide_description")
    private String guideDescriptions;
}
