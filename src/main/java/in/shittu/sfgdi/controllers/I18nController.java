package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingsService greetingsService;


    public I18nController(@Qualifier("i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayHello();
    }
}
