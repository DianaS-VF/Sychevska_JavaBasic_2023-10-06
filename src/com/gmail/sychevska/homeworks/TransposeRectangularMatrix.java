package com.gmail.sychevska.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TransposeRectangularMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rowsNumber = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columnsNumber = scanner.nextInt();

        int[][] matrix = generateOrdinaryMatrix(rowsNumber, columnsNumber);
        System.out.println();

        System.out.println("The matrix for you data: ");
        printMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);
        System.out.println();

        System.out.println("And here's your transposed matrix: ");
        printMatrix(transposedMatrix);

    }

    public static int[][] generateOrdinaryMatrix(int rowsNumber, int columnsNumber) {
        int[][] matrix = new int[rowsNumber][columnsNumber];
        int minRandomNumber = 11;
        int maxRandomNumber = 55;
        for (int i = 0; i < matrix.length; i++) {
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

    public static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
