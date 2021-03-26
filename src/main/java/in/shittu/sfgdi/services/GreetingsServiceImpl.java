package in.shittu.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
