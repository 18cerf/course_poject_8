package com.courseproject.course_poject_8.controller;

import com.courseproject.course_poject_8.repository.GameInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gameinfo")
public class GameInfoController {
    @Autowired
    private GameInfoRepository gameInfoRepository;

    @GetMapping
    public String getGamesInfo(Model model) {
        model.addAttribute("gameInfos", gameInfoRepository.findAll());
        return "games-info";
    }
}
