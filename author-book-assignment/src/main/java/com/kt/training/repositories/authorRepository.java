package com.kt.training.repositories;

import com.kt.training.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepository extends CrudRepository<Author,Long> {
}
