package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet <Integer> set = createSet();
        removeAllNumbersMoreThan10(set);
        for(Integer it: set){
            System.out.println(it);
        }
    }
    public static HashSet<Integer> createSet()
    {
        HashSet <Integer> set = new HashSet<>();
        for(int i=1;i<=40;i+=2){
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator <Integer> it = set.iterator();
        while(it.hasNext()){
            int chislo = it.next();
            if(chislo>10)it.remove();
        }
        return set;
    }
}
