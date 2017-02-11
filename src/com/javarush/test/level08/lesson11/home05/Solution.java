package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuffer result = new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            char buk = s.charAt(i);
            if(i==0 && proverka_bukva(buk))buk = Character.toUpperCase(buk);
            if(i>0 && proverka_bukva(buk)){
                if(s.charAt(i-1)==' ')buk = Character.toUpperCase(buk);
            }
            result.setCharAt(i,buk);
        }
        System.out.println(result);
    }

    public static boolean proverka_bukva(char simvol){
        boolean fl = false;
        if(((int)simvol>=(int)'a') &&((int)simvol<=(int)'z'))fl=true;
        if(((int)simvol>=(int)'а') &&((int)simvol<=(int)'я'))fl=true;
        return fl;
    }

}
