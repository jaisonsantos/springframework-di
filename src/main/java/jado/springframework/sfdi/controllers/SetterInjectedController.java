package jado.springframework.sfdi.controllers;

import jado.springframework.sfdi.services.GreetingService;

public class SetterInjectedController {
    
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
