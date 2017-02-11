package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        ArrayList<String> result = new ArrayList<String>();
        int flL = 0, flR = 0;
        for(int i=0;i<list.size();i++){
            String proverka = list.get(i);
            flL=0;
            flR=0;
            for(int j=0;j<proverka.length();j++){
                if(proverka.charAt(j)=='л')flL=1;
                if(proverka.charAt(j)=='р')flR=1;
            }
            if((flL == 0 && flR == 0)||(flL == 1 && flR == 1))result.add(proverka);
            if(flL == 1 && flR == 0)
            {
                result.add(proverka);
                result.add(proverka);
            }
        }
        return result;
    }
}