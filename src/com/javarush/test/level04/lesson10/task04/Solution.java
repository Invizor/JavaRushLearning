package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int koor_x=10, koor_y;
        while(koor_x>0){
            koor_y=10;
            while(koor_y>0){
                koor_y--;
                System.out.print("S");
            }
            koor_x--;
            System.out.println();
        }
    }
}
