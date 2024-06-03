package com.enviro.assessment.grad001.khethukuthulasimamane.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@Table(name = "waste_category")
@AllArgsConstructor
@NoArgsConstructor
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name_of_waste_category")
    private String nameOfWasteCategory;

    @NotNull
    @Column(name = "disposable")
    private boolean disposable;

    @NotNull
    @Column(name = "recyclable")
    private boolean recyclable;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "container_type")
    private String container;

}
