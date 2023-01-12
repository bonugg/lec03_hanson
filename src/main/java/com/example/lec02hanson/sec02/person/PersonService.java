package com.example.lec02hanson.sec02.person;

import com.example.lec02hanson.sec01.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    @Autowired
    private NameService nameService;

    @Autowired
    private AgeService ageService;

    public Person getPerson01(){
        return new Person(nameService.getNameFromDatabase1(), ageService.getAgeFromDatabase1());
    }

    public Person getPerson02(){
        return new Person(nameService.getNameFromDatabase2(), ageService.getAgeFromDatabase2());
    }
}
