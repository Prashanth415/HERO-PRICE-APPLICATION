package com.example.PricingEngineApplication.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import com.example.PricingEngineApplication.service.PricingService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/pricing")
@CrossOrigin(origins = "*")
public class PricingController {

    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @Operation(summary = "Calculate Total Price")
    @GetMapping("/{configurationId}")
    public BigDecimal calculatePrice(@PathVariable Long configurationId) {

        return pricingService.calculateTotalPrice(configurationId);
    }
}
