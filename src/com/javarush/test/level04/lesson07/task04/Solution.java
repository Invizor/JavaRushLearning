package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    private static int kolichestvo_pol,kolichestvo_otr;
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        kolichestvo_pol = 0;
        kolichestvo_otr = 0;
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        proverka_unarnost(Integer.valueOf(bufferedReader.readLine()));
        System.out.println("количество отрицательных чисел: "+kolichestvo_otr);
        System.out.println("количество положительных чисел: "+kolichestvo_pol);
    }
    public static void proverka_unarnost(int ch){
        if(ch>0)Solution.kolichestvo_pol++;
        if(ch<0)Solution.kolichestvo_otr++;
    }
}
