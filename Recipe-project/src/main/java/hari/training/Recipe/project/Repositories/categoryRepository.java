package hari.training.Recipe.project.Repositories;

import hari.training.Recipe.project.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface categoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
