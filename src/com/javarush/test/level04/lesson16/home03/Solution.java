package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        while (true)
        {
            int vvod_chisla = Integer.valueOf(buffer.readLine());
            summa+=vvod_chisla;
            if(vvod_chisla==-1)break;
        }
        System.out.println(summa);
    }
}
