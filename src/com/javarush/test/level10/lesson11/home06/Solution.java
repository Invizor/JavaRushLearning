package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String firstname,lastname,address;
        private int age;
        private boolean sex;
        private Human brak;

        public Human(String firstname){
            this.firstname = firstname;
        }
        public Human(String firstname,String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
        }
        public Human(String firstname,String lastname,String address){
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
        }
        public Human(String firstname,String lastname,String address,int age){
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.age = age;
        }
        public Human(String firstname,int age){
            this.firstname = firstname;
            this.age = age;
        }
        public Human(String firstname,boolean sex){
            this.firstname = firstname;
            this.sex = sex;
        }
        public Human(String firstname,String lastname,boolean sex){
            this.firstname = firstname;
            this.lastname = lastname;
            this.sex = sex;
        }
        public Human(String firstname,String lastname,boolean sex,int age){
            this.firstname = firstname;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
        }
        public Human(String firstname,String lastname,boolean sex,int age,String address){
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.sex = sex;
            this.age = age;
        }
        public Human(String firstname,String lastname,Human brak){
            this.firstname = firstname;
            this.lastname = lastname;
            this.brak = brak;
        }
    }
}
