package com.javarush.test.level15.lesson12.home04;

public class Sun implements Planet
{
    private static Sun objSun;

    private Sun(){}

    public static Sun getInstance()
    {
        if(objSun == null){
            objSun = new Sun();
        }
        return objSun;
    }
}
