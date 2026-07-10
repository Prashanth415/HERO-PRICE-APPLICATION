package com.example.PricingEngineApplication.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import com.example.PricingEngineApplication.entity.PriceHistory;
import com.example.PricingEngineApplication.service.PriceHistoryService;

import java.util.List;

@RestController
@RequestMapping("/api/price-history")
@CrossOrigin(origins = "*")
public class PriceHistoryController {

    private final PriceHistoryService priceHistoryService;

    public PriceHistoryController(PriceHistoryService priceHistoryService) {
        this.priceHistoryService = priceHistoryService;
    }

    @Operation(summary = "Get Component Price History")
    @GetMapping("/{componentId}")
    public List<PriceHistory> getHistory(@PathVariable Long componentId) {

        return priceHistoryService.getPriceHistory(componentId);
    }
}
