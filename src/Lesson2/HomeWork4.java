package Lesson2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число от 1 до 99: ");
        // Одна КОПЕЙКА
        // Две, три, четыре КОПЕЙКИ
        // Пять - девять, -ять, -цать КОПЕЕК

        int coin = input.nextInt();
        if (coin >= 5 && coin <= 20 || coin % 10 >= 5 && coin % 10 <= 9) {
            System.out.println(coin + " КОПЕЕК");// от 5 до 19 копеек, 10 - 90 копеек и #5 - #9 КОПЕЕК
        } else if (coin % 10 == 0) {
            System.out.println(coin + " КОПЕЕК");
        } else if (coin % 10 >= 2 && coin % 10 <= 4) System.out.print(coin + " КОПЕЙКИ"); // 2-4 КОПЕЙКИ
          else if (coin % 10 == 1) {
            System.out.println(coin + " КОПЕЙКА"); // 1 - #1 КОПЕЙКА
        }  if (coin == 0) {
            System.out.println("С числом 0 отождествляют отсутствие чего-либо. Введите число больше 0 и не больше 99!");
        }


    }


}


