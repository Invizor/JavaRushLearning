package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int number4 = Integer.valueOf(bufferedReader.readLine());
        System.out.println(max_two(max_two(number1,number2),max_two(number3,number4)));
    }

    private static int max_two(int a,int b){
        if(a>=b)return a;
        else return b;
    }
}
