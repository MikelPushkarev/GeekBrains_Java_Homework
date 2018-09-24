/**
 * Java 1-2-3. Lesson 4. Homework
 *
 * @author Pushkarev Mikhail
 * @version dated Sept 24, 2018
 */

import java.util.*;

class TicTacToe {
    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game() {
        initMap ();
        while (true) {
            humanTurn ();
            if (checkWin (DOT_X)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (isMapFull ()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin (DOT_O)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull ()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игры окончена!");
        printMap();
    }

    void initMap (){
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }
    void printMap (){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
}

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y");
            x = sc.nextInt() -1;
            y = sc.nextInt()-1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;

}

    boolean checkWin(char dot) {
        int win = 0;
        for (int i = 0; i < 3; i++) {
            int horizontal = 0;
            int vertical = 0;
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == dot)
                    horizontal++;
                if (map[j][i] == dot)
                    vertical++;
            }
            if (horizontal == 3 || vertical == 3) {
                return true;
            }
        }
        return false;
    }


    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid (int x, int y) {
        if (x < 0 || y < 0 && x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;

    }
}

