package in.shittu.sfgdi.controllers;


import in.shittu.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){

        return greetingsService.sayHello();
    }
}
