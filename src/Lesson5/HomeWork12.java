package Lesson5;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите значение n: ");
        int n = input.nextInt();

        one_str(n);

        for (int i = 0; i < n-2; i++) {
            middle_str(n);
        }

        last_str(n);

    }
    public static void one_str(int n){
        for (int i = 0; i <n*2 ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void middle_str(int n){
        System.out.print("=");

        for (int i = 0; i < n-1; i++) {
            System.out.print("\\/");

        }
        System.out.print("=");

        System.out.println();
         }
    public static void last_str(int n){
        for (int i = 0; i <n*2 ; i++) {
            System.out.print("=");
        }
    }
}


