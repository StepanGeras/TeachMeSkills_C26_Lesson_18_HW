package com.teachmeskills.lesson18.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void nameGroup () {
        List<String> name = new ArrayList<>();
        name.add("Dmitriy");
        name.add("Ivan");
        name.add("Andrey");
        name.add("Mark");
        name.add("Daniil");
        name.add("Lisa");
        name.add("Fedor");
        name.add("Polina");
        name.add("Artur");
        name.add("Sergey");
        name.add("Stepan");

        List<String> nameA = name
                .stream()
                .filter(x -> x.toLowerCase().startsWith("a"))
                .sorted()
                .findFirst()
                .stream().toList();

        System.out.println(nameA);

    }

}
