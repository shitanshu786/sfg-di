package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayHello();
    }
}
