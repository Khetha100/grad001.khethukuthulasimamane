package com.enviro.assessment.grad001.khethukuthulasimamane.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "recycle_tips")
@AllArgsConstructor
@NoArgsConstructor
public class RecyclingTips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "waste_id")
    private WasteCategory waste;

    @Column(name = "recycling_tips")
    private String RecycleTipsInstructions;

    @NotNull
    @Column(name = "recycle_description")
    private String recycleDescriptions;
}
