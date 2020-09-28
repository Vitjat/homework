package homework1;

public class Main {
    public static void main(String[] args) {
        System.out.println(printResult ( 4, 7, 10, 2)); //3
        System.out.println(checkSum(7, 5)); //4
        System.out.println(checkPositive(-5));
        System.out.println(wholeNumber(5));
        printName("Василий");
        visocos(3);
    }

    // 3 задание
    public static double printResult(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    // 4 задание
    public static boolean checkSum (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // 5 задание

    public static int checkPositive(int a) {
        if (a >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
        return a; // без return не смог вывести ответ в консоль
    }

    // 6 задание
    public static boolean wholeNumber (int a) {
        return a < 0;
    }

    // 7 задание
    public static void printName(String s){
        System.out.println("Привет, " + s);
    }

    // 8 здание
    public static int visocos (int e) {
        if (e % 100 != 0 && e % 4 == 0 || e % 400 == 0) {
            System.out.println(e + " год високосный");
        } else {
            System.out.println(e + " год не високосный");
        }
        return e;
    }
}



