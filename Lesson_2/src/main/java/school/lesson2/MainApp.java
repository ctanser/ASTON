package school.lesson2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(sum(5,11));
        //6
        System.out.println(checkNumString(5));
        //7
        System.out.println(checkNumBoolean(5));
        //8
        countString("count", 3);
        //9
        System.out.println(yearVisocos(300));
        //10
        int[] array ={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayInsert(array)));


    }
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign()
    {
        int a = 3;
        int b = -4;
        if ((a+b)>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor()
    {
        int value = 300;
        if (value<=0)
            System.out.println("Красный");
        if  (value>0&&value<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = 3;
        int b = -4;
        if  (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
    public static boolean sum(int a, int b) {
        return ((a + b) >= 10) && ((a + b) <= 20);
    }
    public static String checkNumString(int a)
    {
         if (a>=0)
            return ("Положительное");
        else
            return ("Отрицательное");
    }
    public static boolean checkNumBoolean(int a)
    {
        return  (a<=0);
    }
    public static void countString(String s, int a) {
        for(int i=0;i<a;i++)
            System.out.println(s);
    }
    public static boolean yearVisocos (int year){
        if ((year%4==0)&&(year%100!=0))
            return true;
        if ((year%4==0)&&(year%100==0))
            return year % 400 == 0;

        return false;
    }
    public static int[] arrayInsert (int[] array){
        for (int i=0; i<array.length; i++)
        {
            if (array[i]==1)
                array[i]=0;
            else array[i]=1;
        }
        return array;
    }
}

