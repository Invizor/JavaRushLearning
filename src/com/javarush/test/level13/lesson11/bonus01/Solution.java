package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        FileInputStream input = new FileInputStream(filePath);
        reader = new BufferedReader(new FileReader(filePath));
        String l = "";
        ArrayList<Integer> list = new ArrayList<>();
        while((l = reader.readLine()) != null)
        {
            int chislo = Integer.parseInt(l);
            if(chetnoe(chislo))list.add(chislo);
        }
        input.close();
        sort(list);
        for(int i=0;i<list.size();i++)System.out.println(list.get(i));
    }

    public static boolean chetnoe(int n)
    {
        if( n % 2 == 0)return true;
        else return false;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> mas)
    {
        int obmen = 0;
        for(int i=1; i < mas.size(); i++)
        {
            for(int j=0; j < i; j++)
            {
                if(mas.get(j) > mas.get(i)){
                    obmen = mas.get(i);
                    mas.set(i,mas.get(j));
                    mas.set(j,obmen);
                }
            }
        }
        return mas;
    }
}
