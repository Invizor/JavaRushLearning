package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int  c = 1,d = 0;
        while(a>0 && b>0){
            if(a % b ==0){ c = b; break; }
            if(b % a ==0){ c = a; break; }
            if(a<b)
            {
                d = a;
                a = b;
                b = d;
            }
            a = a % b;
        }
        System.out.println(c);
    }
}
