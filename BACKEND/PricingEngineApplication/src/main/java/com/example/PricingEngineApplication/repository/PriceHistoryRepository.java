package com.example.PricingEngineApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PricingEngineApplication.entity.PriceHistory;

import java.util.List;

@Repository
public interface PriceHistoryRepository
        extends JpaRepository<PriceHistory, Long> {

    List<PriceHistory> findByComponentComponentId(Long componentId);
}