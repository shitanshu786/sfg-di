package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;

public class ConstructorInjectionController {
    private final GreetingsService greetingsService;

    public ConstructorInjectionController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayHello();
    }
}
