package com.example.lec02hanson.sec01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class TestConfiguration {

    @Bean
    @Primary
    public String name(){
        return "Potato";
    }

    @Bean
    public int age(){
        return 40;
    }

    @Bean
    public Person person1(){
        return new Person("carrot", 30);
    }

    @Bean
    public Person person2(){
        return new Person(name(), age());
    }

    @Bean
    public Person person3parameters(String a,int b){
        return new Person(a, b-10);
    }

    @Bean
    public String name2(){
        return "Tomato";
    }

    @Bean
    public Person person4parameters(@Qualifier("name2") String a, int b){
        return new Person(a, b-10);
    }
}
