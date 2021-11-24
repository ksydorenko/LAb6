package edu.ntudp.sau.sydorenko.javaspringbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DecisionController {
    @GetMapping("/decision")
    public String answer (Model model) {
        model.addAttribute("name", "кинодраматург");
        return "decision";
    }
}
