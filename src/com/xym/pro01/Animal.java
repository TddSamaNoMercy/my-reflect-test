package com.xym.pro01;

import java.awt.event.ActionEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

class Animal implements Cloneable{
    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    private String name;
    
    public boolean comp(Animal a){
        return this.equals(a);
    }
    private int id = 0;
    public void g(){
        System.out.println("Animal g() method");
    }
    static {
        System.out.println("Animal类静态初始化块");
    }

    public Animal(String name) {
        this.name = name;
//        System.out.println("Animal类构造方法");
    }
    private void f(){
        System.out.println("父类f方法");
    }

    public void sayName(){
        System.out.println(name);
    }

//    Paths
//    @Override
//    public int compareTo(Animal animal) {
//        return 0;
//    }

    public void g(ActionEvent actionEvent) {
    }
}


interface MyDefaultInterface{
    default void f(){
        System.out.println("我是f");
    }

//    static void g(){
//        System.out.println("我是g");
//    }
}
