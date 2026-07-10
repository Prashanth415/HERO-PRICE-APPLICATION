package com.example.PricingEngineApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PricingEngineApplication.entity.CycleConfiguration;

@Repository
public interface CycleConfigurationRepository
        extends JpaRepository<CycleConfiguration, Long> {
}