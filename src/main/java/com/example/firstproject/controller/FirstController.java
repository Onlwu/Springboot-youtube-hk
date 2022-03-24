package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model)
    {
        model.addAttribute("username","이름을 적어주세요!");
       return "greetings";//templates에서 찾음
    }
    @GetMapping("/bye")
    public String SeeYouNext(Model model)
    {
        model.addAttribute("nickname","닉네임을 적어주세요!");
        return "bye";
    }

}
