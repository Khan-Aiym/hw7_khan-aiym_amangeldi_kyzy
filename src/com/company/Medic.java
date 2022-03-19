package com.company;

public class Medic extends Hero{
    @Override
    public String HavingSuperAbility (String ability){
        return "Medic применил суперспособность " + ability;
}
private int healPoints = 10;
    public String increaseExperience () {
        return "Медик вылечил героя на " + healPoints + "%";

    }
}
