package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int number1 = Integer.valueOf(input);
        input = bufferedReader.readLine();
        int number2 = Integer.valueOf(input);
        if(number1<=number2)
            System.out.println(number1);
        else System.out.println(number2);
    }
}