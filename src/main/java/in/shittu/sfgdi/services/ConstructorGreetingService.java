package in.shittu.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello World --- Constructor";
    }
}
