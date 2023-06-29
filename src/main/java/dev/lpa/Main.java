package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};
        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo = %d%n", five,
                    (val == 0 ? "==" : (val > 0) ? "<" : ">"), i, val);
        }
//        5 < 0: compareTo = 1
//        5 == 5: compareTo = 0
//        5 > 10: compareTo = -1
//        5 < -50: compareTo = 1
//        5 > 50: compareTo = -1

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};
        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo = %d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }
//        banana > apple: compareTo = 1
//        banana == banana: compareTo = 0
//        banana < pear: compareTo = -14
//        banana > BANANA: compareTo = 32

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
//        [BANANA, apple, banana, pear]

        System.out.println("A:" + (int) 'A' + " " + "a:" + (int) 'a');
        System.out.println("B:" + (int) 'B' + " " + "b:" + (int) 'b');
        System.out.println("P:" + (int) 'P' + " " + "p:" + (int) 'p');
//        A:65 a:97
//        B:66 b:98
//        P:80 p:112

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
//          [Ann, Tim, Zach]

        System.out.println("result = " + tim.compareTo(("Mary")));
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class dev.lpa.Student (java.lang.String is in module java.base of loader 'bootstrap'; dev.lpa.Student is in unnamed module of loader 'app')
//        at dev.lpa.Student.compareTo(Student.java:18)
//        at dev.lpa.Main.main(Main.java:51)
    }
}