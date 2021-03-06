package com.foxsmartpro.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EndController {

    @GetMapping("/end")
    public String getEndPage(){
        return "endget";
    }
    @PostMapping("/end")
    public String postEndPage(String userName, ModelMap modelMap){
        modelMap.addAttribute("string",userName);
        return "endpost";
    }
}
