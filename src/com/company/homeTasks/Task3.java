package com.company.homeTasks;

/*
* 4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
     всех элементов массива.
* */

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public void third() {

        int line = 0;
        int column = 0;
        int summ = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введи размерность массива. Сначала размер строки: ");
        line = scan.nextInt();
        System.out.print("Введи размерность массива. Теперь размер столбца: ");
        column = scan.nextInt();

        int[][] array = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                summ += array[i][j];
            }
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива равна: " + summ);
    }
}
