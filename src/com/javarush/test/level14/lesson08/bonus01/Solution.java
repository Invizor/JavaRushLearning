package com.javarush.test.level14.lesson08.bonus01;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;

import javax.management.AttributeNotFoundException;
import javax.print.PrintException;
import javax.security.auth.login.CredentialException;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.zip.DataFormatException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        exceptions.add(new RuntimeException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new InputMismatchException());
        exceptions.add(new CancellationException());
        exceptions.add(new BrokenBarrierException());
        exceptions.add(new TimeoutException());
        exceptions.add(new DataFormatException());
        exceptions.add(new CredentialException());
        exceptions.add(new PrintException());

    }
}
