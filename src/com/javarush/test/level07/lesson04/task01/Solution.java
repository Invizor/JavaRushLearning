package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=20;i++)array[i-1]=Integer.parseInt(buffer.readLine());
        return array;
    }

    public static int max(int[] array) {
        int max_value = -1000;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max_value)max_value=array[i];
        }
        return max_value;
    }
}
