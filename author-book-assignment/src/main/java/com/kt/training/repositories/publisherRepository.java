package com.kt.training.repositories;

import com.kt.training.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface publisherRepository extends CrudRepository<Publisher,Long> {
}
