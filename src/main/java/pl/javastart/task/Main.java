package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] array = createArray();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i * j;
                    System.out.printf("%5d | ", array[i][j]);
                }
                System.out.println();
                System.out.printf("-".repeat(8 * array.length - 1));
                System.out.println();
            }
        } else {
            System.out.println("Podales zla liczbe wierszy lub kolumn");
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
            int[][] array = new int[size1][size2];
            return array;
        } else {
            return null;
        }
    }
}

