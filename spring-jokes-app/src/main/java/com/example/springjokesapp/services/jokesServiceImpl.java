package com.example.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class jokesServiceImpl implements jokesService {

    private final ChuckNorrisQuotes ChuckNorrisQuotes;

    public jokesServiceImpl() {
        this.ChuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return ChuckNorrisQuotes.getRandomQuote();
    }
}
