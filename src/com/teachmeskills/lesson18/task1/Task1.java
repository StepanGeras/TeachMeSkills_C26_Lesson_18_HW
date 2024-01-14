package com.teachmeskills.lesson18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void doTask1 () {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            list.add((int) (Math.random() * 100));

        }

        System.out.println(list);

        List<Integer> newList1 = list
                .stream()
                .distinct()
                .toList();

        List<Integer> newList2 = list
                .stream()
                .filter(n -> n % 2 == 0)
                .skip(6)
                .limit(11)
                .toList();

        List<Integer> newList3 = list
                .stream()
                .map( x -> x * 2)
                .toList();

        int counted = (int) list
                .stream()
                .count();

        List<Integer> newList4 = list
                .stream()
                .sorted()
                .limit(4)
                .toList();

        double averaged = list
                .stream()
                .collect(Collectors.averagingDouble(x -> x));

        System.out.println("Delete duplicate\n" + newList1);
        System.out.println("Even 7-17\n" + newList2);
        System.out.println("Multiply by 2\n" + newList3);
        System.out.println("Sort and display the first 4 elements\n" + newList4);
        System.out.println("Display the number of elements in the stream\n" + counted);
        System.out.println("Display the arithmetic mean of all numbers in the stream\n" + averaged);

    }

}
