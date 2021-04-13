package in.shittu.sfgdi.services;

public class PrimaryGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello World --- Primary";
    }
}
