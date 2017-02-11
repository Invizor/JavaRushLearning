package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(){}
    public Solution(int i){}
    public Solution(String s){}
    Solution(char c){}
    Solution(int a,int b){}
    Solution(short e){}
    protected Solution(String a,String b){}
    protected Solution(long v){}
    protected Solution(char a, char b){}
    private Solution(Object o){}
    private Solution(Exception ex){}
    private Solution(byte v){}
}

