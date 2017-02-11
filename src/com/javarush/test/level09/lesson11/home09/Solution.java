package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap <String, Cat> map = new HashMap<>();
        map.put("Vasya",new Cat("Vasya"));
        map.put("Kolya",new Cat("Kolya"));

        map.put("Andrey",new Cat("Andrey"));
        map.put("Anton",new Cat("Anton"));

        map.put("Oleg",new Cat("Oleg"));
        map.put("Dima",new Cat("Dima"));

        map.put("Vika",new Cat("Vika"));
        map.put("Polina",new Cat("Polina"));

        map.put("Kristina",new Cat("Kristina"));
        map.put("Mariya",new Cat("Mariya"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set <Cat> set = new HashSet<>();
        for(Map.Entry<String,Cat> pair : map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
