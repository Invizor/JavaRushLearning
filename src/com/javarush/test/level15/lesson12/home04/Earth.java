package com.javarush.test.level15.lesson12.home04;

public class Earth implements Planet
{
    private static Earth objEarth;

    private Earth(){}

    public static Earth getInstance()
    {
        if(objEarth == null){
            objEarth = new Earth();
        }
        return objEarth;
    }
}
