package com.example.PricingEngineApplication.serviceimpl;


import com.example.PricingEngineApplication.entity.CycleConfiguration;
import com.example.PricingEngineApplication.repository.CycleConfigurationRepository;
import com.example.PricingEngineApplication.service.ConfigurationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    private final CycleConfigurationRepository repository;

    public ConfigurationServiceImpl(CycleConfigurationRepository repository) {
        this.repository = repository;
    }

    @Override
    public CycleConfiguration createConfiguration(CycleConfiguration configuration) {
        return repository.save(configuration);
    }

    @Override
    public CycleConfiguration getConfiguration(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Configuration not found with id : " + id));
    }

    @Override
    public List<CycleConfiguration> getAllConfigurations() {
        return repository.findAll();
    }

    @Override
    public void deleteConfiguration(Long id) {
        repository.deleteById(id);
    }
}