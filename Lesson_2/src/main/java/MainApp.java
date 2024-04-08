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
        System.out.println("Високосный " + yearVisocos(404));
        //10
        int[] array ={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayInverse(array)));
        //11
        int[] arrayOneHundred = new int[100];
        System.out.println(Arrays.toString(array100(arrayOneHundred)));
        //12
        int[] arrayTwelve = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arrayTwelveMethod(arrayTwelve)));
        //13
        int[][] arraySquare = new int[8][8];
        System.out.println(Arrays.deepToString(arraySquareMethod(arraySquare)));
        //14
        System.out.println(Arrays.toString(initialValueMethod(5, 1)));
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
        {
            System.out.println("Сумма положительная");
        }
        else
        {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor()
    {
        int value = -1200;
        if (value<=0) {
            System.out.println("Красный");
        }
        else if  (value>0&&value<=100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = -4;
        if  (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean sum(int a, int b) {
        return ((a + b) >= 10) && ((a + b) <= 20);
    }

    public static String checkNumString(int a)
    {
         if (a>=0) {
             return ("Положительное");
         }
        else {
             return ("Отрицательное");
         }
    }

    public static boolean checkNumBoolean(int a)
    {
        return  (a<=0);
    }

    public static void countString(String s, int a) {
        for(int i=0;i<a;i++) {
            System.out.println(s);
        }
    }

    public static boolean yearVisocos (int year){
        if ((year%4==0)&&(year%100!=0)) {
            return true;
        }
        else{
           return year % 400 == 0;
       }
    }

    public static int[] arrayInverse(int[] array){
        for (int i=0; i<array.length; i++)
        {
            if (array[i]==1)
                array[i]=0;
            else array[i]=1;
        }
        return array;
    }

    public static int[] array100(int[] array){
        for (int i=0; i<100; i++)
        {
             array[i]=i+1;
        }
        return array;
    }

    public static int[] arrayTwelveMethod(int[] array){
        for (int i=0; i<array.length; i++)
        {   if (array[i]<6) {
            array[i] = array[i] * 2;
        }
        }
        return array;
    }

    public static int[][] arraySquareMethod(int[][] array){
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length; j++)        {
                if (i==j) {
                    array[i][j] = 1;
                    array[i][(array.length-1)-i]=1;
                }
        }
        return array;
    }

    public static int[] initialValueMethod(int len, int initialValue ){
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}


