package guru.qa;

public class HomeWork {

    public static void main (String[] args) {

        // математические операторы
        int a = 1;
        int b = 10;
        System.out.println("a + b = " + (a * b));
        System.out.println("a - b = " + (a + b));
        System.out.println("a * b = " + (a - b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("--a = " + (--a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));

        // логические операторы
        int c = 2;
        int d = 5;
        System.out.println("c < e = " + (c < d));
        System.out.println("c > e = " + (c > d));
        System.out.println("c == e = " + (c == d));
        System.out.println("c >= e = " + (c >= d));
        System.out.println("c <= e = " + (c <= d));
        System.out.println("c != e = " + (c != d));

        //переполнения при вычислениях
        byte byteVar = 127;
        int intNumber = 2147483647;
        System.out.println((byte) (byteVar + 1)); //-128
        System.out.println(intNumber + 1); // -2147483648

        //вычисления комбинаций типов данных (int и double)
        int varInt = 366;
        double varDouble = 36.8;
        System.out.println( "varInt + varDouble: " + (varInt + varDouble));
        System.out.println("varInt - varDouble: " + (varInt - varDouble));
    }
}
