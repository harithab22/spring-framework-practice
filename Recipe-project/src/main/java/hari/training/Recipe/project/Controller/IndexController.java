package hari.training.Recipe.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index"})
    public String getIndexpage(){
        return "index";
    }
}
