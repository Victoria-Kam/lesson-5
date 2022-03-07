package com.company.homeTasks;

import java.util.Random;
import java.util.Scanner;

/*
 * 5. Создайте двумерный массив. Выведите на консоль диагонали массива.
 * */
public class Task5 {

    public void fifth() {

        int size = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введи размерность массива: ");
        size = scan.nextInt();

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nГлавная диагональ матрицы:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    for (int k = 0; k < j; k++) {           // уикл для лучшего вывода главной диагонали матрицы. Добавляем табуляцию в соответствии столбцу матрицы
                        System.out.print("\t");
                    }
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
