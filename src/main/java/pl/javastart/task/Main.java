package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] array = createArray();
        if (array != null) {
            printArray(array);
        } else {
            System.out.println("Podales zla liczbe wierszy lub kolumn");
        }
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
                System.out.printf("%5d |", array[i][j]);
            }
            System.out.println();
            System.out.println("-".repeat(7 * array[i].length));
        }
    }

    private static int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        System.out.println("Podaj liczbe wierszy.");
        int size1 = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn.");
        int size2 = scanner.nextInt();
        if (size1 < max && size2 < max) {
            return new int[size1][size2];
        } else {
            return null;
        }
    }
}

