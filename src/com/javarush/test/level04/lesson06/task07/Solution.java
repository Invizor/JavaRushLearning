package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(bufferedReader.readLine());
        int number2 = Integer.valueOf(bufferedReader.readLine());
        int number3 = Integer.valueOf(bufferedReader.readLine());
        if(number1!=number2 && number1!=number3)System.out.println(1);
        if(number2!=number1 && number2!=number3)System.out.println(2);
        if(number3!=number1 && number3!=number2)System.out.println(3);
    }
}
