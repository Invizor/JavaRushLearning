package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        Date tekushaya_data = new Date(date);
        Date nachalo_goda = new Date(tekushaya_data.getYear(),0,1);
        long proshlo_vremeni = tekushaya_data.getTime() - nachalo_goda.getTime();
        long del = 1000*60*60*24L;
        long dayOnThisYear = proshlo_vremeni / del + 1;
        if(dayOnThisYear % 2 != 0) return true; else return false;
    }
}
