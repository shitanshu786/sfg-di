package in.shittu.sfgdi.services;

public class GreetingServiceFactory {

    public GreetingsService getGreetingService(String greetingType){
        switch (greetingType){
            case "Constructor":
                return new ConstructorGreetingService();
            case "Setter":
                return new SetterGreetingService();
            default:
                return new ConstructorGreetingService();

        }
    }
}
