package in.shittu.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class SetterGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello World --- Setter";
    }
}
