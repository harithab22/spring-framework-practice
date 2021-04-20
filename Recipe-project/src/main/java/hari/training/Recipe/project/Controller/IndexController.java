package hari.training.Recipe.project.Controller;

import hari.training.Recipe.project.Repositories.categoryRepository;
import hari.training.Recipe.project.Repositories.uniofmeasureRepository;
import hari.training.Recipe.project.model.Category;
import hari.training.Recipe.project.model.unitofmeasure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private categoryRepository categoryrepository;
    private uniofmeasureRepository uniofmeasurerepository;

    public IndexController(categoryRepository categoryrepository, uniofmeasureRepository uniofmeasurerepository) {
        this.categoryrepository = categoryrepository;
        this.uniofmeasurerepository = uniofmeasurerepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexpage(){

        Optional<Category> categoryOptional=categoryrepository.findByDescription("American");
        Optional<unitofmeasure> unitofmeasureOptional=uniofmeasurerepository.findByDescription("Teaspoon");

        System.out.println("Category id is"+ categoryOptional.get().getId());
        System.out.println("UOM id is"+ unitofmeasureOptional.get().getId());
        return "index";
    }
}
