package com.example.PricingEngineApplication.service;


import java.util.List;

import com.example.PricingEngineApplication.entity.PriceHistory;

public interface PriceHistoryService {

    List<PriceHistory> getPriceHistory(Long componentId);

}