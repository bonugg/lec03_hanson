package com.example.lec02hanson.sec01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lect02Application {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        var name = context.getBean(String.class);
        System.out.println("name : " + name);

        var age = context.getBean(int.class);
        System.out.println("age : " + age);

        var person1 = context.getBean("person1", Person.class);
        System.out.println("person1 : "+person1);

        var person2 = context.getBean("person2", Person.class);
        System.out.println("person2 : "+person2);

        var person3 = context.getBean("person3parameters", Person.class);
        System.out.println("person3 : "+person3);

        var person4 = context.getBean("person4parameters", Person.class);
        System.out.println("person4 : "+person4);
    }
}
