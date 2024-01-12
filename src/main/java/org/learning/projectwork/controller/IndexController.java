package org.learning.projectwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping
  public String home(Model model){
    model.addAttribute("title", "Welcome");
    model.addAttribute("user", "Ghost");
    model.addAttribute("footer", "Bye Bye");
    return "home";
  }

  @GetMapping("/about")
  public String about(){
  return "about";
  }
}
