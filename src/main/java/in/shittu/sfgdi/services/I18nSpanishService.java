package in.shittu.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishService implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hola --- ES";
    }
}
