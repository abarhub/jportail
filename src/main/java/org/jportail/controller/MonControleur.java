package org.jportail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class MonControleur {


//    @GetMapping("/ma-page")
//    public String index(Model model) {
//        model.addAttribute("message", "Bonjour depuis MVC !");
//        return "index"; // Recherche templates/index.html
//    }

    @GetMapping("/test1")
    public Mono<String> maVue(Model model) {
        model.addAttribute("msg", "Mode Réactif");
        return Mono.just("index");
    }

}
