package com.foxsmartpro.service;

public class LastCityName {
    private static String actuallyCity;

    public static char getLastLiteral(){
        return actuallyCity.charAt(actuallyCity.length()-1);
    }

    public static String getActuallyCity() {
        return actuallyCity;
    }

    public static void setActuallyCity(String actuallyCity) {
        LastCityName.actuallyCity = actuallyCity;
    }
}
