package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -1000000000;

        int N = Integer.valueOf(reader.readLine());
        int vhodnoe_znach = 0;
        for(int i = 1; i <= N; i++)
        {
            vhodnoe_znach = Integer.valueOf(reader.readLine());
            if(vhodnoe_znach>maximum)maximum=vhodnoe_znach;
        }

        System.out.println(maximum);
    }
}
