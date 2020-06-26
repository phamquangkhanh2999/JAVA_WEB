package application.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("vm","Hello Wolrd");
        model.addAttribute("name","Pham quang khanh");
        model.addAttribute("abc","Pham quang khanh");
        return "home";
    }
}
