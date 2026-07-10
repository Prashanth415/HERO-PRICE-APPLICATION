package com.example.PricingEngineApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PricingEngineApplication.entity.ConfigurationComponent;

import java.util.List;

@Repository
public interface ConfigurationComponentRepository
        extends JpaRepository<ConfigurationComponent, Long> {

    List<ConfigurationComponent> findByConfigurationConfigurationId(Long configurationId);
}
