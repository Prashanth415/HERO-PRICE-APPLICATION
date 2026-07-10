package com.example.PricingEngineApplication.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cycle_configurations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CycleConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long configurationId;

    private String configurationName;

    private String description;

    @OneToMany(mappedBy = "configuration",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ConfigurationComponent> components;
}