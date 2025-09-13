package org.lessons.java.spring_intro.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/greetings")
  public String greetings(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("name", name);

    return "greetings";
  }

  @GetMapping("/getTime")
  public String getTime(Model model) {
    model.addAttribute("currentTime", LocalTime.now());

    return "getTime";
  }

  @GetMapping("/getDate")
  public String getDate(Model model) {
    model.addAttribute("currentDate", LocalDate.now());

    return "getDate";
  }

  @GetMapping("/createEmail")
  public String createEmail(@RequestParam(name = "localPart") String localPart, Model model) {
    model.addAttribute("localPart", localPart);

    return "createEmail";
  }

}
