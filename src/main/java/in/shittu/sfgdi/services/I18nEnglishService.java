package in.shittu.sfgdi.services;

import in.shittu.sfgdi.repositories.EnglishGreetingRepository;

public class I18nEnglishService implements GreetingsService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayHello() {
        return englishGreetingRepository.getGreeting();
    }
}
