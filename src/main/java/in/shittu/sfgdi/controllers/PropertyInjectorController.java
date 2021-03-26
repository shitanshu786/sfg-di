package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;

public class PropertyInjectorController {
    public GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayHello();
    }
}
