package com.example.PricingEngineApplication.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import com.example.PricingEngineApplication.entity.CycleConfiguration;
import com.example.PricingEngineApplication.service.ConfigurationService;

import java.util.List;

@RestController
@RequestMapping("/api/configurations")
@CrossOrigin(origins = "*")
public class ConfigurationController {

    private final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @Operation(summary = "Create Configuration")
    @PostMapping
    public CycleConfiguration createConfiguration(
            @RequestBody CycleConfiguration configuration) {

        return configurationService.createConfiguration(configuration);
    }

    @Operation(summary = "Get All Configurations")
    @GetMapping
    public List<CycleConfiguration> getAllConfigurations() {

        return configurationService.getAllConfigurations();
    }

    @Operation(summary = "Get Configuration By Id")
    @GetMapping("/{id}")
    public CycleConfiguration getConfiguration(@PathVariable Long id) {

        return configurationService.getConfiguration(id);
    }

    @Operation(summary = "Delete Configuration")
    @DeleteMapping("/{id}")
    public String deleteConfiguration(@PathVariable Long id) {

        configurationService.deleteConfiguration(id);

        return "Configuration Deleted Successfully";
    }
}
