package com.example.lec02hanson.sec02.person;

import org.springframework.stereotype.Component;

@Component
public class AgeService {
    public int getAgeFromDatabase1(){
        return 30;
    }

    public int getAgeFromDatabase2(){
        return 15;
    }
}
