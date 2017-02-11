package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList <String> list = new ArrayList<String>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=10;i++)list.add(buffer.readLine());

        ArrayList<String> result = doubleValues(list);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0;i<list.size();i++){
            result.add(list.get(i));
            result.add(list.get(i));
        }
        return result;
    }
}