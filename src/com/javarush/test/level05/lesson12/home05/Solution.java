package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Boolean IsExit = true;
        int summa = 0, chislo_input=0;
        String vvod;
        while(IsExit){
            vvod = buffer.readLine();
            if(vvod.equals("сумма"))IsExit=false;
            else
            {
                chislo_input = Integer.valueOf(vvod);
                summa+=chislo_input;
            }
        }
        System.out.println(summa);
    }
}
