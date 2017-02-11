package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    static int kolichestvo;
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        kolichestvo = 0;
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        System.out.println(kolichestvo);
    }
    public static void proverka_unarnost(int ch){
        if(ch>0)Solution.kolichestvo++;
    }
}
