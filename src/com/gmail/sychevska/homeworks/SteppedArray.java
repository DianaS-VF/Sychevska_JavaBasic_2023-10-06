package com.gmail.sychevska.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minMatrixSizeRows = 1;
        int minMatrixSizeColumns = 2;
        int maxMatrixSize = 50;

        System.out.printf("Enter the number of rows (from %s to %s): ", minMatrixSizeRows, maxMatrixSize);
        int rowsNumber = scanner.nextInt();

        System.out.printf("Enter the maximum number of columns (from %s to %s): ", minMatrixSizeColumns, maxMatrixSize);
        int maxUserColumnsNumber = scanner.nextInt();

        if (rowsNumber <= 0 || maxUserColumnsNumber < minMatrixSizeColumns) {
            System.out.println("Haven't I told you to use the corresponding range? Try once more.");
            return;
        } else {
            System.out.println("\nThe matrix according to your data: ");
        }

        int[][] matrix = generateOrdinaryMatrix(rowsNumber, maxUserColumnsNumber);
        printMatrix(matrix);

        System.out.println("\nYour matrix after sorting (odd rows - descending, even rows - ascending): ");

        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortAscending(matrix[i]);
            } else {
                sortDescending(matrix[i]);
            }
        }

        printMatrix(matrix);

        System.out.println("\nMatrix with all rows sorted (ascending): ");
        for (int[] rows : matrix) sortAscending(rows);
        printMatrix(matrix);

        System.out.println("\nArray with the minimal elements from each row : ");
        printMinimumInRows(matrix);
        System.out.println();

        int[] array = fillArrayWithMinimalFromRows(matrix);

        sortAscending(array);

        System.out.println("\nMinimal element of the matrix: ");
        int minimalMatrix = array[0];
        System.out.println(minimalMatrix);

        int sum = sumAllElementsMatrix(matrix);
        System.out.println("\nThe sum of all elements in array: ");
        System.out.println(sum);

        int divisionResult = sum / minimalMatrix;
        System.out.println("\nDivision result for the sum of all elements and the minimal element: ");
        System.out.println(divisionResult);

    }

    private static void printMinimumInRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j == 0; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static int[] fillArrayWithMinimalFromRows(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j == 0; j++) {
                array[i] = matrix[i][j];
            }
        }
        return array;
    }

    public static int[][] generateOrdinaryMatrix(int rowsNumber, int maxColumnsNumber) {
        int[][] matrix = new int[rowsNumber][];
        int minRandomNumber = 1;
        int maxRandomNumber = 100;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[ThreadLocalRandom.current().nextInt(1, maxColumnsNumber)];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(minRandomNumber, maxRandomNumber);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    private static int sumAllElementsMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}