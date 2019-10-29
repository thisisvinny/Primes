package primes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PrimesController {

    @RequestMapping("/prime")
    public String showPrimes(@RequestParam(value = "number", required = true, defaultValue = "10") int number, Model model) {
        model.addAttribute("number", number);
        model.addAttribute("primes", new Primes(number).getPrimes().toString());
        return "primes";
    }

}
