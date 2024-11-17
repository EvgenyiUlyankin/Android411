package Lesson2;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Введите число от 0 до 23: ");
//        int time = input.nextInt();
//        switch (time){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Доброй ночи!");
//                break;
//
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Доброе утро!");
//                break;
//
//            case 13:
//            case 14:
//            case 15:
//            case 16:
//                System.out.println("Добрый день!");
//                break;
//
//            case 17:
//            case 18:
//            case 19:
//            case 20:
//            case 21:
//            case 22:
//            case 23:
//                System.out.println("Добрый вечер!");
//                break;
//            default:
//                System.out.println("Вы ввели неправильное значение!");
//        }
        System.out.print("Введите число от 0 до 23: ");
        int time = input.nextInt();
//        switch (time){
//            case 0, 1, 2, 3, 4, 5 -> System.out.println("Доброй ночи!");
//            case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Доброе утро!");
//            case 13, 14, 15, 16, 17 -> System.out.println("Добрый день!");
//            case 18, 19, 20, 21, 22, 23 -> System.out.println("Добрый вечер!");
//            default -> System.out.println("Вы ввели неправильное значение!");
//    }
        switch (
                (time >= 0 && time <= 5) ? 1 :
                        (time >= 6 && time <= 12) ? 2 :
                                (time >= 13 && time <= 17) ? 3 :
                                        (time >= 18 && time <= 23) ? 4 : 5
        ) {
            case 1 -> System.out.println("Доброй ночи!");
            case 2 -> System.out.println("Доброе утро!");
            case 3 -> System.out.println("Добрый день!");
            case 4 -> System.out.println("Добрый вечер!");
            case 5 -> System.out.println("Вы ввели неправильное значение!");
        }


        }
    }
