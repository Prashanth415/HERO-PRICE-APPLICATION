package com.example.PricingEngineApplication.service;



import java.util.List;

import com.example.PricingEngineApplication.entity.Component;

public interface ComponentService {

    Component addComponent(Component component);

    Component updateComponent(Long id, Component component);

    Component updatePrice(Long id, double newPrice);

    Component getComponentById(Long id);

    List<Component> getAllComponents();

    void deleteComponent(Long id);
}