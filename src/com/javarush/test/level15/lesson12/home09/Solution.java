package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer url = new StringBuffer(reader.readLine());
        url.append("&");
        ArrayList<String> list = new ArrayList<>();
        int indPos = url.indexOf("?")+1;

        url.delete(0,indPos);

        String predikat,param;
        String znObj="";

        while(url.indexOf("&")!=-1){
            indPos = url.indexOf("&")+1;

            predikat = url.substring(0,indPos-1);
            param = "";

            for(int j = 0; j < indPos; j++){
                if((url.charAt(j)>='a' && url.charAt(j)<='z') ||(url.charAt(j)>='A' && url.charAt(j)<='Z')){
                    param+=url.charAt(j);
                }
                else{
                    if(param.equals("obj")){
                        znObj = url.substring(j+1,indPos-1);
                    }
                    list.add(param);
                    break;
                }
            }

            url.delete(0,indPos);
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        if(!znObj.equals("")){
            try
            {
                double ch = Double.parseDouble(znObj);
                alert(ch);
            }
            catch(Exception ex)
            {
                alert(znObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
