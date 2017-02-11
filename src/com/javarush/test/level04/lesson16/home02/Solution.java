package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(buffer.readLine());
        int number2 = Integer.valueOf(buffer.readLine());
        int number3 = Integer.valueOf(buffer.readLine());
        if(number1>=number2 && number2>=number3)System.out.println(number2);
        if(number3>=number2 && number2>=number1)System.out.println(number2);
        if(number2>=number3 && number3>=number1)System.out.println(number3);
        if(number1>=number3 && number3>=number2)System.out.println(number3);
        if(number2>=number1 && number1>=number3)System.out.println(number1);
        if(number3>=number1 && number1>=number2)System.out.println(number1);
    }
}
