package hari.training.Recipe.project.Repositories;

import hari.training.Recipe.project.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepository extends CrudRepository<Category,Long> {
}
