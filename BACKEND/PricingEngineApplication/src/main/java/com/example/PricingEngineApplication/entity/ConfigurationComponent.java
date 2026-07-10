package com.example.PricingEngineApplication.entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "configuration_components")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfigurationComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "configuration_id")
    private CycleConfiguration configuration;

    @ManyToOne
    @JoinColumn(name = "component_id")
    private Component component;

    private Integer quantity;
}