package com.company.homeTasks;

import java.util.Random;
import java.util.Scanner;

/*
*   Создать трехмерный массив из целых чисел.
    С помощью циклов "пройти" по всему массиву и увеличить каждый
    элемент на заданное число. Пусть число, на которое будет
    увеличиваться каждый элемент, задается из консоли.
* */
public class Task1 {

    public void first() {

        int size = 0;
        int value = 0;
        int increment = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введи размер массива: ");

        size = scan.nextInt();

        int[][][] array = new int[size][size][size];

        for (int i = 0; i < size; i++) {          // Заполнение массива
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    array[i][j][k] = random.nextInt(100);
                }
            }
        }

        for (int i = 0; i < size; i++) {          // Вывод массива на экран
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("На какое число нужно увеличить каждый элемент массива?: ");
        increment = scan.nextInt();

        for (int i = 0; i < size; i++) {          //  Прибавляем введенное число к каждому элементу массива
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        for (int i = 0; i < size; i++) {          // Вывод нового массива на экран
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
