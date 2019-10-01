package com.xym.pro01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class Cat extends Animal implements MyDefaultInterface {
    private int age = 0;
    static boolean cute = false;
//    {
//        System.out.println("Cat类初始化块");
//    }
//    static {
//        System.out.println("Cat类静态初始化块");
//    }
    Cat(String name){
        super(name);
//        System.out.println(this);
//        System.out.println("Cat类构造器");
    }
    public void g(){
        Timer t = new Timer(1000, System.out::println);
        Timer t1 = new Timer(1000, (ActionEvent e) -> System.out.println(e));
    }
//    public static void f(){
//        System.out.println("子类静态方法");
//    }
    static class A{
        int a;
    }


}
