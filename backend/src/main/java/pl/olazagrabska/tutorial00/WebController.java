package pl.olazagrabska.tutorial00;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    @Autowired
    private ArticlesRepository repository;
    @GetMapping("/hello")
    public String helloWorld(Model model){
        Iterable<Element> elements = repository.findAll();

        model.addAttribute("elements", elements);
        return "hello";
    }
}