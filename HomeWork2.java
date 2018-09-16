/**
 * Java 1-2-3. Lesson 2. Homework
 *
 * @author Pushkarev Mikhail
 * @version dated Sept 16, 2018
 */
import java.util.Arrays;

class HomeWork2 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
    }

    public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(Arrays.toString(arr));
        }
    }

    public static void task2() {
        int[] arr2 = new int[8];
        for (int x = 0, y = 0; x < arr2.length; x++, y += 3) {
            arr2[x] = y;
            System.out.print(Arrays.toString(arr2));
        }
    }

    public static void task3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arr3.length; a++)
            if (arr3[a] < 6) arr3[a] = arr3[a] * 2;
        System.out.print(Arrays.toString(arr3));
    }

}







