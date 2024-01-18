package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        System.out.println("Podaj liczbe wierszy.");
        int size1 = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn.");
        int size2 = scanner.nextInt();
        int[][] array = new int[size1][size2];

        for (int i = 0; i < array.length; i++) {
            if (size1 > max || size2 > max) {
                System.out.println("Podales za duze rozmiary tablicy");
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
                System.out.printf("%5d | ", array[i][j]);
            }
            System.out.println();
        }
    }
    }
