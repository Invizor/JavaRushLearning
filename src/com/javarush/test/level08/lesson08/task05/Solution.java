package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        HashMap <String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for(Map.Entry<String, String> pair : map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
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
        map.put("Fdafsdf","adsfgfgghh");
        map.put("Pdkfdja","fsdgfaq");
        map.put("Ldjfqjnmsgv","Wfgasdsqw");
        map.put("Dfffffff","Nikolay");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap <String, Integer> podschet_vhozhdeniy = new HashMap<>();
        for(Map.Entry<String, String> pair : map.entrySet()){
            if(! podschet_vhozhdeniy.containsKey(pair.getValue())){
                podschet_vhozhdeniy.put(pair.getValue(),1);
            } else{
                podschet_vhozhdeniy.put(pair.getValue(),2);
            }
        }

        for(Map.Entry<String, Integer> pair : podschet_vhozhdeniy.entrySet()){
            if(pair.getValue()>=2)removeItemFromMapByValue(map,pair.getKey());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
