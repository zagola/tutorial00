package pl.olazagrabska.tutorial00;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Optional;

@Controller
public class WebController {
    @Autowired
    private ArticlesRepository repository;

    @GetMapping("/")
    public String helloWorld(Model model){
        Iterable<Element> elements = repository.findAll();

        model.addAttribute("elements", elements);
        return "main.html";
    }
    @GetMapping("/content/{id}")
    public String getContentById(Model model, @PathVariable Character id) {
        Optional<Element> element = repository.findById(id);
        if (element.isPresent()) {
            model.addAttribute("element", element.get());
            return "content.html";
        } else {
            return "notfound.html";
        }
    }
}