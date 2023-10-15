package com.gmail.sychevska.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TransposeSquareMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size for your square matrix: ");
        int matrixSize = scanner.nextInt();

        int[][] matrix = generateSquareMatrix(matrixSize);
        System.out.println();

        System.out.println("Your square matrix is ready: ");
        printOrdinarySquareMatrix(matrix);
        System.out.println();

        System.out.println("And here is your transposed matrix: ");
        printTransposedSquareMatrix(matrix);
        System.out.println();

        System.out.println("I wish transposing rectangular matrix would be as easy as transposing a square one by just switching \"i\" and \"j\"");

    }

    public static int[][] generateSquareMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        int minValue = 11;
        int maxValue = 55;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(minValue, maxValue);
            }
        }
        return matrix;
    }


    public static void printOrdinarySquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTransposedSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
