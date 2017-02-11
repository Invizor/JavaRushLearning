package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap <String, Date> map = createMap();
        removeAllSummerPeople(map);
        for(Map.Entry<String,Date> pair : map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 13 1991"));
        map.put("Ivanov", new Date("JANUARY 12 1973"));
        map.put("Petrov", new Date("AUGUST 8 1991"));
        map.put("Fedorov", new Date("SEPTEMBER 5 1982"));
        map.put("Sidorov", new Date("OCTOBER 30 1987"));

        map.put("Ezinshtein", new Date("MARCH 21 1999"));
        map.put("Klimenko", new Date("JUNE 17 1971"));
        map.put("Jaspodo", new Date("APRIL 20 1975"));
        map.put("Kasjdfh", new Date("JULY 14 1993"));
        map.put("Lfjdfqqsdf", new Date("DECEMBER 2 1994"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Date birthday = it.next().getValue();
            if(birthday.getMonth()>=5 && birthday.getMonth()<=7)
            {
                it.remove();
            }
        }

    }
}
