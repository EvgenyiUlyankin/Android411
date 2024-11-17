package Lesson5;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите значение n: ");
        int n = input.nextInt();
        int h = 3;
        int w = n * 2-4;

        one_str(n);
        middle_str(h, w);
        last_str(n);



    }
    public static void one_str(int n){
        for (int i = 0; i <n*2 ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void middle_str(int h, int w){
        String ch = "\\/";
        for (int i = 0; i < h ; i++ ) {
            for (int j = 0; j < w ; j++) {
                if (i == 0 || i == h || j == 0 || j == w-1)
                    System.out.print("=");
                else
                    System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void last_str(int n){
        for (int i = 0; i <n*2 ; i++) {
            System.out.print("=");
        }
    }
}
