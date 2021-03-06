package hari.training.Recipe.project.Controller;

import hari.training.Recipe.project.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexpage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";


    }
}
