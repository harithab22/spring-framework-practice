package com.kt.training.bootstrap;

import com.kt.training.domain.Author;
import com.kt.training.domain.Book;
import com.kt.training.domain.Publisher;
import com.kt.training.repositories.publisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrapdata implements CommandLineRunner {

    private final com.kt.training.repositories.authorRepository authorRepository;
    private final com.kt.training.repositories.bookRepository bookRepository;
    private final publisherRepository publisherRepository;

    public bootstrapdata(com.kt.training.repositories.authorRepository authorRepository, com.kt.training.repositories.bookRepository bookRepository, com.kt.training.repositories.publisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publisher publisher=new Publisher("Haritha Publishers","4824 Paseo","Kansas","MO","64110");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);


        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of publishers:"+publisherRepository.count());
        System.out.println("Number of Books for publisher :"+publisher.getBooks().size());
    }
}