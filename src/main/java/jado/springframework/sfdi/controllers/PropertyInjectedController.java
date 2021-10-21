package jado.springframework.sfdi.controllers;

import jado.springframework.sfdi.services.GreetingService;

public class PropertyInjectedController {
    
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    
}
