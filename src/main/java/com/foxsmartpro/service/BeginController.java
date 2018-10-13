package com.foxsmartpro.service;

import com.foxsmartpro.repositories.CitiesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeginController {

    @GetMapping("/begin")
    public String getBeginPage(ModelMap modelMap){

        CitiesRepository citiesRepository = new CitiesRepository();
        LastCityName.setActuallyCity(citiesRepository.getCities().get("a"));

        modelMap.addAttribute("actuallyCity",LastCityName.getActuallyCity());
        modelMap.addAttribute("lastLiteral",LastCityName.getLastLiteral());
        return "begin";
    }
}
