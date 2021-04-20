package hari.training.Recipe.project.services;

import hari.training.Recipe.project.Repositories.RecipeRepository;
import hari.training.Recipe.project.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImp(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet=new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
