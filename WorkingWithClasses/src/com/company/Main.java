package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Cat cat=new Cat();
        Dog dog=new Dog();
        Parrot parrot=new Parrot();


        System.out.println("Datas Cat");
        cat.getName();
        cat.getColor();
        cat.getAge();
        cat.getYearBurn();
        cat.getSex();


        System.out.println("Datas Dog ");

        dog.getName();
        dog.getColor();
        dog.getAge();
        dog.getYearBurn();
        dog.getSex();
        System.out.println("Datas Parrot");
        parrot.getName();
        parrot.getColor();
        parrot.getAge();
        parrot.getYearBurn();
        parrot.getSex();

        System.out.println("Cat name is: "+cat.name+"\n"+"Cat color is: "+cat.color+"\n"+"Cat age is: "+cat.age
                +"\n"+"Cat date of burth is: "+cat.yearBurth+"\n"+"Cat sex is: "+cat.sex+"\n\n");

        System.out.println("Dog name is: "+dog.name+"\n"+"Dog color is: "+dog.color+"\n"+"Dog age is: "+dog.age
                +"\n"+"Dog date of  buth is: "+dog.yearBurth+"\n"+"Cat sex is: "+dog.sex+"\n\n");

        System.out.println("Parrot name is: "+parrot.name+"\n"+"Parrot color is: "+parrot.color+"\n"+"Parrot age is: "+parrot.age
                +"\n"+"Parrot date of burth is: "+parrot.yearBurth+"\n"+"Cat sex is: "+parrot.sex+"\n");


    }
}
