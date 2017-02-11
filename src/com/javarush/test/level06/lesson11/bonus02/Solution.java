package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedushka = reader.readLine();
        Cat catDedushka = new Cat(dedushka);

        String babushka = reader.readLine();
        Cat catBabushka = new Cat(babushka);

        String father = reader.readLine();
        Cat catFather = new Cat(father,catDedushka,null);

        String mother = reader.readLine();
        Cat catMother = new Cat(mother,null,catBabushka);

        String sin = reader.readLine();
        Cat catSin = new Cat(sin,catFather,catMother);

        String doch = reader.readLine();
        Cat catDoch = new Cat(doch,catFather,catMother);


        System.out.println(catDedushka);
        System.out.println(catBabushka);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSin);
        System.out.println(catDoch);
    }

    public static class Cat
    {
        private String name;
        private Cat parent_father;
        private Cat parent_mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name,Cat parent_father, Cat parent_mother)
        {
            this.name = name;
            this.parent_mother = parent_mother;
            this.parent_father = parent_father;
        }

        @Override
        public String toString()
        {
            String result = "";
            result="Cat name is "+name+", ";
            if(parent_mother==null)result+="no mother";
            else result+=("mother is "+parent_mother.name);
            result+=", ";
            if(parent_father==null)result+="no father";
            else result+=("father is "+parent_father.name);
            return result;
        }
    }

}
