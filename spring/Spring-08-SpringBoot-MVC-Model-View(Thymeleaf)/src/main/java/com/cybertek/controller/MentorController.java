package com.cybertek.controller;


import com.cybertek.enums.Gender;
import com.cybertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {


    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", Gender.MALE, 45));
        mentorList.add(new Mentor("Tom", "Hanks", Gender.MALE, 43));
        mentorList.add(new Mentor("Ammy", "Bryan", Gender.FEMALE, 23));
        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }


}
