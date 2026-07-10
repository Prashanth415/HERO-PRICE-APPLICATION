package com.example.PricingEngineApplication.service;


import java.util.List;

import com.example.PricingEngineApplication.entity.CycleConfiguration;

public interface ConfigurationService {

    CycleConfiguration createConfiguration(CycleConfiguration configuration);

    CycleConfiguration getConfiguration(Long id);

    List<CycleConfiguration> getAllConfigurations();

    void deleteConfiguration(Long id);
}
