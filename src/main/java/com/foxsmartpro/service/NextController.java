package com.foxsmartpro.service;

import com.foxsmartpro.repositories.CitiesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NextController {

    @GetMapping("/next")
    public String getNextPage(@RequestParam(value = "word") String world, ModelMap modelMap){
        CitiesRepository citiesRepository = new CitiesRepository();

        if(world.charAt(0)== LastCityName.getLastLiteral()){
            modelMap.addAttribute("usersCity", world);
            LastCityName.setActuallyCity(citiesRepository.getCities().get(String.valueOf(world.charAt(world.length()-1))));
            modelMap.addAttribute("responseCity",LastCityName.getActuallyCity());
            return "next";
        }else{
            modelMap.addAttribute("responseCity",LastCityName.getActuallyCity());
            return "wrong";
        }
    }
}
