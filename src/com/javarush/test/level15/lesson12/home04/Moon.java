package com.javarush.test.level15.lesson12.home04;

public class Moon implements Planet
{
    private static Moon objMoon;

    private Moon(){}

    public static Moon getInstance()
    {
        if(objMoon == null){
            objMoon = new Moon();
        }
        return objMoon;
    }
}
