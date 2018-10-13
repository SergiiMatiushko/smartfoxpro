package com.foxsmartpro.repositories;

import java.util.LinkedHashMap;
import java.util.Map;

public class CitiesRepository {

    private Map<String, String> cities;

    public CitiesRepository(){
        this.cities=new LinkedHashMap<>();

        cities.put("a","Ankara");
        cities.put("b","Bangkok");
        cities.put("c","Cairo");
        cities.put("d","Delhi");
        cities.put("e","Elizabeth");
        cities.put("f","Fremont");
        cities.put("g","Gilbert");
        cities.put("h","Hiroshima");
        cities.put("i","Istanbul");
        cities.put("j","Jakarta");
        cities.put("k","Kyiv");
        cities.put("l","London");
        cities.put("m","Mumbai");
        cities.put("n","New York");
        cities.put("o","Oslo");
        cities.put("p","Prague");
        cities.put("q","Qingxing");
        cities.put("r","Racinik");
        cities.put("s","Saanich");
        cities.put("t","Tokyo");
        cities.put("u","Udine");
        cities.put("v","Valencia");
        cities.put("w","Washington");
        cities.put("x","Xalapa");
        cities.put("y","York");
        cities.put("z","Zamboanga City");
    }

    public Map<String, String> getCities() {
        return cities;
    }
}
