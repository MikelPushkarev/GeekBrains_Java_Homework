/**
 * Java 1-2-3. Lesson 3. Homework
 *
 * @author Pushkarev Mikhail
 * @version dated Sept 20, 2018
 */
import java.util.*;

class Work3 {

    public static void main(String[] args) {
        GameNumber();
    }

    public static void GameNumber(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int user = 0;
        int chance = 0;
        int number = random.nextInt(10);
        System.out.println("Попробуйте угадать число в диапазоне от 0 до 9. У вас три попытки!");
        for (chance = 0; chance < 3; chance++){
            System.out.println("Попытка " + (chance+1) + ": ");
            user = scanner.nextInt();
            if (user < number) System.out.println("Ваше число меньше!");
            if (user > number) System.out.println("Ваше число больше!");
            if (user == number) {System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                user = scanner.nextInt();
                if (user == 1) GameNumber();
                    else if (user == 0){System.out.println("До свидания!");
                }
            }
        }
        System.out.println("Вы не угадали!");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        user = scanner.nextInt();
             if (user == 1) GameNumber();
             else {System.out.println("До свидания!");
        }
    }

}