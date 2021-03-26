package com.kt.training.repositories;

import com.kt.training.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface bookRepository extends CrudRepository<Book,Long> {
}
