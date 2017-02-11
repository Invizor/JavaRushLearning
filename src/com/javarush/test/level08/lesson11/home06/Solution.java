package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Kolya", true, 5, new ArrayList<Human>());
        Human child2 = new Human("Vasya", true, 9, new ArrayList<Human>());
        Human child3 = new Human("Tolya", true, 12, new ArrayList<Human>());
        ArrayList<Human> deti = new ArrayList<Human>();
        deti.add(child1);
        deti.add(child2);
        deti.add(child3);
        Human mother = new Human("Oksana", false, 35, deti);
        Human father = new Human("Andrey", true, 37, deti);
        deti.clear();
        deti.add(mother);
        Human grandmother_M = new Human("Maya", false, 62, deti);
        Human grandfather_M = new Human("Viktor", true, 67, deti);
        deti.clear();
        deti.add(father);
        Human grandmother_F = new Human("Anna", false, 64, deti);
        Human grandfather_F = new Human("Dmitriy", true, 68, deti);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(mother);
        System.out.println(father);

        System.out.println(grandmother_M);
        System.out.println(grandfather_M);
        System.out.println(grandmother_F);
        System.out.println(grandfather_F);
    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList <Human> children = new ArrayList<>();

        public Human(String name, Boolean sex, int age, ArrayList <Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
