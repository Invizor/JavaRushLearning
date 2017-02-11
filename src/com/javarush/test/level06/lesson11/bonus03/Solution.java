package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] massiv = new int[6];
        int obmen = 0;
        for(int i=1;i<=5;i++){
            massiv[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=2;i<=5;i++){
            for(int j=1;j<i;j++){
                if(massiv[i]<massiv[j]){
                    obmen = massiv[j];
                    massiv[j]=massiv[i];
                    massiv[i]=obmen;
                }
            }
        }
        for(int i=1;i<=5;i++)System.out.println(massiv[i]);

    }
}
