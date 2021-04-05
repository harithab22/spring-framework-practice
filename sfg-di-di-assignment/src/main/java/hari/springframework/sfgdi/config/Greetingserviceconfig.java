package hari.springframework.sfgdi.config;

import hari.springframework.datasource.Dummydatasource;
import hari.springframework.pets.PetService;
import hari.springframework.pets.Petservicefactory;
import hari.springframework.repositories.EnglishGreetingRepository;
import hari.springframework.repositories.EnglishGreetingRepositoryImpl;
import hari.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasource.properties")
@Configuration

public class Greetingserviceconfig {

    @Bean
    Dummydatasource dummydatasource(@Value("${hari.username}") String username,
                                    @Value("${hari.password}") String password,
                                    @Value("${hari.someurl}") String someurl){
        Dummydatasource dummydatasource=new Dummydatasource();
        dummydatasource.setUsername(username);
        dummydatasource.setPassword(password);
        dummydatasource.setSomeurl(someurl);
        return dummydatasource;
    }

    @Bean
    Petservicefactory petservicefactory(){
        return new Petservicefactory();
    }
    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(Petservicefactory petservicefactory){
        return petservicefactory.getPetService("dog");
    }
    @Profile("cat")
    @Bean
    PetService catPetService(Petservicefactory petservicefactory){
        return petservicefactory.getPetService("cat");

    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();

    }
    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService(){
        return new I18NSpanishService();
    }
    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();

    }
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
