package com.example.PricingEngineApplication.service;


import java.math.BigDecimal;

public interface PricingService {

    BigDecimal calculateTotalPrice(Long configurationId);

}