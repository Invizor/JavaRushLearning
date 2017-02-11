package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int obmen;
        if(number1<number2){
            obmen=number1;
            number1=number2;
            number2=obmen;
        }
        if(number1<number3){
            obmen=number1;
            number1=number3;
            number3=obmen;
        }
        if(number2<number3){
            obmen=number2;
            number2=number3;
            number3=obmen;
        }
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }

}
