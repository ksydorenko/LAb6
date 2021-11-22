package edu.ntudp.sau.sydorenko.javaspringbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StartPage {
    @GetMapping("/startpage")
    public String startpage(Model model) {
        return "startpage";
    }
   @GetMapping("/")
    public String init(Model model) {
        return "startpage";
    }

}
