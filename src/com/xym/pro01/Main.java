package com.xym.pro01;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String... args) {
        int i = 0;
        if (i != 1) System.out.println("test master");
        System.out.println("test editor");

        System.out.println("test .git ignore");

        User[] names = {new User(01, "dada"), new User(02, "dad")
                , new User(03, "dssssada")};
        Arrays.sort(names, Comparator.comparing(User::getId));
        Arrays.sort(names, Comparator.comparingInt(o -> o.getName().length()));
//        Arrays.sort(names, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getId() - o2.getId();
//            }
//        });
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        names.sort(Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(names));

//        int i = 1;
//        new Timer(1000, e -> {
//            System.out.println("At the tone, the time is " + i +  new Date());
//            Toolkit.getDefaultToolkit().beep();
//        }).start();
//        i++;
//        JOptionPane.showMessageDialog(null, "Quit program");
//        System.exit(0);
//        Cat cat = new Cat("da");
//        Animal a = new Animal("da");
//        Cat cat1 = cat;
//        System.out.println(cat.equals(cat1));

        System.out.println(Arrays.toString(args));
//        java.util.List<String> names = new ArrayList<>();
//        names.contains()
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s == null;
//            }
//        });
//        try {
//            a.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

    }
}
