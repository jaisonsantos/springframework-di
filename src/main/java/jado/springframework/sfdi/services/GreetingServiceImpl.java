package jado.springframework.sfdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld";
    }
}
