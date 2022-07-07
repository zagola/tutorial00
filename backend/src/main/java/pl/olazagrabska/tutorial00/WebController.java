package pl.olazagrabska.tutorial00;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String helloWorld(Model model){
        return "hello";
    }
}