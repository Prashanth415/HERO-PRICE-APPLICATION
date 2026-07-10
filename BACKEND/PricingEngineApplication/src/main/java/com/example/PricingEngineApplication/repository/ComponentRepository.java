package com.example.PricingEngineApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PricingEngineApplication.entity.Component;

import java.util.List;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long> {

    List<Component> findByActiveTrue();

    List<Component> findByCategory(String category);

    Component findByName(String name);
}