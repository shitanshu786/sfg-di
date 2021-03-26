package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    private GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayHello();
    }

    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
