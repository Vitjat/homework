package homework3;

import java.util.Random;
import java.util.Scanner;

public class MainHWthree {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        gameRandomNamber();

    }


    private static void gameRandomNamber() {
        int namber = random.nextInt(10);
        int answer;

        do {
            String userNamber = sc.nextLine();
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ввелите число от 0 до 9. У вас всего 3 попытки");
                int userNumber = sc.nextInt();
                if (namber = userNamber) {
                    guess = true;
                    break;
                } else {
                    System.out.println("Вы не угадали\n Это была " + i + " попытка");
                        userNamber = sc.nextLine();
                    }
                    break;
            }
            if (guess) {
                System.out.println("Вы угадали, это число " + namber);
            } else {
                System.out.println("Вы проиграли. Как же так... Но не расстраивайтесь!\n А правильный ответ был " + number);
            }
            System.out.println("Если хотите сыграть снова, нажмите 1");
            answer = sc.nextLine();
        } while (answer == 1);
        System.out.println("Всего доброго!");
    }

}