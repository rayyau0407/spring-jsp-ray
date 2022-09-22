package dev.springjspray.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Simple Solution home page!");
        FrictionBook frictionBook = new FrictionBook();
        model.addAttribute("bookSays", frictionBook.bookSays);
        frictionBook.author = "RayYauAuthor";
        model.addAttribute("author", frictionBook.author);
        String uri = "https://catfact.ninja/breeds";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        model.addAttribute("restTemplate", result);

        return "index";
    }

    @GetMapping("/book")
    public String book(Model model) {
        FrictionBook frictionBook = new FrictionBook();
        model.addAttribute("bookSays", frictionBook.bookSays);

        return "bookPage";
    }

}
