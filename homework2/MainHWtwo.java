package homework2;

import java.util.Arrays;

public class MainHWtwo {
    public static void main (String[] args) {
        hw1();
        hw2();
        hw3();
        hw4();
    }

    /** замена 0 на 1 и 1 на 0 в массиве */
    public static void hw1() {
        int[] arr = {1, 1, 1, 0, 1, 0, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /** заполнение пустого массива значениями 0, 3, 6... */
    public static void  hw2() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j = j + 3){
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    /** в массиве числа меньше 6 умножаются на 2 */
    public static void hw3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /** квадратный двумерный массив с единицами по диаганали */
    public static void hw4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 4 - 1 - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
