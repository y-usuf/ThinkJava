package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println("Hello, World!");
        String name= "Emily";
        System.out.println("My name is " + name);

        String FirstName = "Moses ";
        String LastName = "Kwemoi";
        String FullName = FirstName.concat(LastName);
        System.out.println(FullName);

        int x=24, y=25;
        int age = x+y;
        System.out.println(age);
        System.out.println(x+y);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(FullName.indexOf("Kwe"));




    }
}
