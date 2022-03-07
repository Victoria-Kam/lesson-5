package com.company.homeTasks;

/*
* 2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать
элементам циклам значения B(Black) или W(White). Результат работы
программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
* */
public class Task2 {

    public void second() {

        int size = 8;
        String black = "B";
        String white = "W";

        String[][] desk = new String[size][size];

        for (int i = 0; i < size; i++) {            // Заполнение массива
            for (int j = 0; j < size; j++) {
                if ((i % 2 == 0)) {                 // если строка четная
                    desk[i][j] = white;
                    desk[i][++j] = black;
                }
                if ((i % 2 == 1)) {                 // если строка нечетная
                    desk[i][j] = black;
                    desk[i][++j] = white;
                }
            }
        }

        for (int i = 0; i < size; i++) {            // Вывод массива в консоль
            for (int j = 0; j < size; j++) {
                System.out.print(desk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
