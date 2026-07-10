package com.example.PricingEngineApplication.serviceimpl;


import com.example.PricingEngineApplication.entity.ConfigurationComponent;
import com.example.PricingEngineApplication.entity.CycleConfiguration;
import com.example.PricingEngineApplication.repository.CycleConfigurationRepository;
import com.example.PricingEngineApplication.service.PricingService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PricingServiceImpl implements PricingService {

    private final CycleConfigurationRepository repository;

    public PricingServiceImpl(CycleConfigurationRepository repository) {
        this.repository = repository;
    }

    @Override
    public BigDecimal calculateTotalPrice(Long configurationId) {

        CycleConfiguration configuration = repository.findById(configurationId)
                .orElseThrow(() ->
                        new RuntimeException("Configuration Not Found"));

        BigDecimal total = BigDecimal.ZERO;

        for (ConfigurationComponent cc : configuration.getComponents()) {

            BigDecimal price = cc.getComponent().getCurrentPrice();

            BigDecimal quantity = BigDecimal.valueOf(cc.getQuantity());

            total = total.add(price.multiply(quantity));
        }

        return total;
    }
}