package com.example.PricingEngineApplication.controller;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import com.example.PricingEngineApplication.entity.Component;
import com.example.PricingEngineApplication.service.ComponentService;

import java.util.List;

@RestController
@RequestMapping("/api/components")
@CrossOrigin(origins = "*")
public class ComponentController {

    private final ComponentService componentService;

    public ComponentController(ComponentService componentService) {
        this.componentService = componentService;
    }

    @Operation(summary = "Add New Component")
    @PostMapping
    public Component addComponent(@RequestBody Component component) {
        return componentService.addComponent(component);
    }

    @Operation(summary = "Get All Components")
    @GetMapping
    public List<Component> getAllComponents() {
        return componentService.getAllComponents();
    }

    @Operation(summary = "Get Component By Id")
    @GetMapping("/{id}")
    public Component getComponent(@PathVariable Long id) {
        return componentService.getComponentById(id);
    }

    @Operation(summary = "Update Component")
    @PutMapping("/{id}")
    public Component updateComponent(@PathVariable Long id,
                                     @RequestBody Component component) {
        return componentService.updateComponent(id, component);
    }

    @Operation(summary = "Update Component Price")
    @PatchMapping("/{id}/price")
    public Component updatePrice(@PathVariable Long id,
                                 @RequestParam double price) {
        return componentService.updatePrice(id, price);
    }

    @Operation(summary = "Delete Component")
    @DeleteMapping("/{id}")
    public String deleteComponent(@PathVariable Long id) {

        componentService.deleteComponent(id);

        return "Component Deleted Successfully";
    }
}