package Lesson3;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = 7, w = 13;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print(" ");
                for (int k = 1; k <= 7; k++) {
                    System.out.print("");
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }

}
