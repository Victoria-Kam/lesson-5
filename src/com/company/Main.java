package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] array1 = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] array2 = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] arraySumm = new int[array1.length][array2[0].length];

        for (int i = 0; i < arraySumm.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array2.length; k++) { // ошибка в условии цикла array2.length (было array2[0].length)
                    arraySumm[i][j] = arraySumm[i][j] + (array1[i][k] * array2[k][j]);  // ошибка в индексе array1[i][k] (было array1[j][k])
                }
            }
        }

        System.out.println("Длина первого массива " + array1.length);
        System.out.println("Длина второго массива " + array2.length);

        for (int i = 0; i < arraySumm.length; i++) {
            for (int j = 0; j < arraySumm.length; j++) {
                System.out.print(arraySumm[i][j] + " ");
            }
            System.out.println();
        }
    }
}
