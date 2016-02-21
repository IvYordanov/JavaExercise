package com.company;

import java.util.Scanner;

/**
 * Created by Yordanov on 2/21/2016.
 */
public class Parrot {
    String name;
    String color;
    String age;
    String yearBurth;
    String sex;
    public  Parrot() {
        this.name = name;
        this.color = color;
        this.age = age;
        this.yearBurth = yearBurth;
        this.sex=sex;

    }
    Scanner input = new Scanner(System.in);
    public String getName() {
        System.out.println("Enter name: ");
        name = input.nextLine();
        return name;
    }

    public String getColor() {
        System.out.println("Enter color: ");
        color = input.nextLine();
        return color;
    }

    public String getYearBurn() {
        System.out.println("Enter date of burth: ");
        yearBurth = input.nextLine();
        return yearBurth;
    }

    public String getAge() {
        System.out.println("Enter age: ");
        age = input.nextLine();
        return age;
    }
    public  String getSex(){
        System.out.println("Enter sex: ");
        age= input.nextLine();
        return sex;
    }

}
