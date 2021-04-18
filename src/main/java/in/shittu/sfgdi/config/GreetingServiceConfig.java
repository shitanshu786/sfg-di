package in.shittu.sfgdi.config;

import in.shittu.sfgdi.datasource.FakeDataSource;
import in.shittu.sfgdi.repositories.EnglishGreetingRepository;
import in.shittu.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import in.shittu.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguration.getUsername());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfiguration.getJdbcUrl());
        return fakeDataSource;
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishService i18nSpanishService(){
        return new I18nSpanishService();
    }

    @Profile("EN")
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishService i18nEnglishService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

//    @Bean
//    ConstructorGreetingService constructorGreetingService(){
//        return new ConstructorGreetingService();
//    }

//    @Bean
//    PropertyGreetingService propertyGreetingService(){
//        return new PropertyGreetingService();
//    }

//    @Bean
//    SetterGreetingService setterGreetingService(){
//        return new SetterGreetingService();
//    }

    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    GreetingsService constructorGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("Constructor");
    }

    @Bean
    GreetingsService setterGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("Setter");
    }
}
