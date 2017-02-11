package com.javarush.test.level14.lesson08.bonus03;

public class Singleton
{
    private static boolean flag;
    private static Singleton singleton;
    private Singleton()
    {
    }
    public static Singleton getInstance()
    {
        if(!flag){
            singleton = new Singleton();
            flag = true;
        }
        return singleton;
    }
}
