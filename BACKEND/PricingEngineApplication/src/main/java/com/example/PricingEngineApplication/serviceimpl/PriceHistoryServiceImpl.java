package com.example.PricingEngineApplication.serviceimpl;

import com.example.PricingEngineApplication.entity.PriceHistory;
import com.example.PricingEngineApplication.repository.PriceHistoryRepository;
import com.example.PricingEngineApplication.service.PriceHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceHistoryServiceImpl implements PriceHistoryService {

    private final PriceHistoryRepository repository;

    public PriceHistoryServiceImpl(PriceHistoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PriceHistory> getPriceHistory(Long componentId) {

        return repository.findByComponentComponentId(componentId);

    }
}