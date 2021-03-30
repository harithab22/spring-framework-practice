package hari.springframework.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getgreeting() {
        return "Hello World - EN";
    }
}
