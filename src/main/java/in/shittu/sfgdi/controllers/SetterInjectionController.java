package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;

public class SetterInjectionController {
    private GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayHello();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
