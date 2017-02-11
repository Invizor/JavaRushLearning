package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Kolya",23,"Krasnodar,budennogo,102");
        Man man2 = new Man("Anton",23,"Stavropol,brusneva,35");
        Woman woman1 = new Woman("Tanya",21,"Krasnodar,budennogo,102");
        Woman woman2 = new Woman("Oksana",22,"Stavropol,brusneva,35");
        System.out.println(man1.print());
        System.out.println(man2.print());
        System.out.println(woman1.print());
        System.out.println(woman2.print());
    }

   public static class Man
   {
       private String name,address;
       private int age;

       public Man(String name,int age, String address){
           this.name = name;
           this.age = age;
           this.address = address;
       }

       public String print()
       {
           String result = name+" "+age+" "+address;
           return result;
       }
   }

    public static class Woman
    {
        private String name,address;
        private int age;

        public Woman(String name,int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String print()
        {
            String result = name+" "+age+" "+address;
            return result;
        }
    }
}
