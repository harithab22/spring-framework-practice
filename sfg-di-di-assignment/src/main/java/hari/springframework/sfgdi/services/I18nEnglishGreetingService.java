package hari.springframework.sfgdi.services;

import hari.springframework.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    public final EnglishGreetingRepository englishGreetingService ;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingService) {
        this.englishGreetingService = englishGreetingService;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
