package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap <String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Nikolay"));
        System.out.println(getCountTheSameLastName(map,"Fedorov"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap < String, String> map = new HashMap<>();
        map.put("Ivanov","Nikolay");
        map.put("Petrov","Aleksey");
        map.put("Fedorov","Anton");
        map.put("Sidorov","Evkakiy");
        map.put("Ezinshtein","Olga");
        map.put("Klimenko","Nikolay");
        map.put("Fdafsd","adsfgfg");
        map.put("Pdkfdja","fsdgfaq");
        map.put("Ldjfqjnms","Wfgasds");
        map.put("Dfffffff","Nikolay");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int kolvo = 0;
        for(String imena : map.values()){
            if(imena.equals(name))kolvo++;
        }
        return kolvo;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        if(map.containsKey(lastName))return 1;
        else return 0;
    }
}
