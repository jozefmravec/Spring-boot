package com.appslab.springbootapp.model;


public class Person {
   String name;
   int age;
   int balance;

    public Person(String name, int age, int balance){
       this.name = name;
       this.age = age;
       this.balance = balance;
   }
   public  String getName() { return name; }
   public  int getAge() { return age; }
    public int getBalance() { return balance; }
    public Person() {

    }



}

