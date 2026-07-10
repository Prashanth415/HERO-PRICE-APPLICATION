package com.example.PricingEngineApplication.serviceimpl;


import org.springframework.stereotype.Service;

import com.example.PricingEngineApplication.entity.Component;
import com.example.PricingEngineApplication.entity.PriceHistory;
import com.example.PricingEngineApplication.repository.ComponentRepository;
import com.example.PricingEngineApplication.repository.PriceHistoryRepository;
import com.example.PricingEngineApplication.service.ComponentService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ComponentServiceImpl implements ComponentService {

    private final ComponentRepository repository;
    private final PriceHistoryRepository priceHistoryRepository;
    
    public ComponentServiceImpl(ComponentRepository repository, PriceHistoryRepository priceHistoryRepository) {
        this.repository = repository;
        this.priceHistoryRepository = priceHistoryRepository;
    }

    @Override
    public Component addComponent(Component component) {
        return repository.save(component);
    }

    @Override
    public List<Component> getAllComponents() {
        return repository.findAll();
    }

    @Override
    public Component getComponentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Component Not Found"));
    }

    @Override
    public void deleteComponent(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Component updateComponent(Long id, Component component) {
        Component existing = getComponentById(id);

        existing.setName(component.getName());
        existing.setCategory(component.getCategory());
        existing.setCurrentPrice(component.getCurrentPrice());
        existing.setActive(component.isActive());

        return repository.save(existing);
    }

    @Override
public Component updatePrice(Long id, double newPrice) {

    Component component = repository.findById(id)
            .orElseThrow(() ->
                    new RuntimeException("Component Not Found"));

    PriceHistory history = new PriceHistory();

    history.setComponent(component);
    history.setPrice(component.getCurrentPrice());
    history.setEffectiveFrom(LocalDate.now());

    priceHistoryRepository.save(history);

    component.setCurrentPrice(BigDecimal.valueOf(newPrice));

    return repository.save(component);
}

    // @Override
    // public Component updatePrice(Long id, double newPrice) {
    //     throw new UnsupportedOperationException("Implement price update logic");
    // }
}