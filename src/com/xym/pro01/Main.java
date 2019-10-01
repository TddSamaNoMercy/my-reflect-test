package com.xym.pro01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Predicate;

public class Main {

    public static void main(String... args) {
        int i = 1;
        if (i != 1) System.out.println("测试git branch");
        System.out.println("test editor");
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
        java.util.List<String> names = new ArrayList<>();
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
