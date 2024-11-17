package Lesson5;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();
        int [] list = new  int[size];

        int option;
        do {
            System.out.println("Меню: ");
            System.out.println("1. Ввод элементов массива: ");
            System.out.println("2. Отображение массива: ");
            System.out.println("3. Поиск элементов в массиве: ");
            System.out.println("4. Сортировка массива: ");
            System.out.println("5. Выход: ");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option){
                case 1:
                    inputArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
            }

        } while (option != 5);

    }
    static void inputArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("->");
            array[i] = input.nextInt();
        }
    }

    static void displayArray(int[] array){

    }
}
