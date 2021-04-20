package hari.training.Recipe.project.Repositories;

import hari.training.Recipe.project.model.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
