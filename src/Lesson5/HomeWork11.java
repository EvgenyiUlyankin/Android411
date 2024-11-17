package Lesson5;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Напишите метод нахождения площади фигур: ");
        System.out.println( );
        System.out.print("1 - прямоугольник, 2 - треугольник, 3 - круг: ");

        int figure = input.nextInt();
        if (figure == 1){
            rectangle();
    } else if (figure == 2) {
            triangle();
        } else if (figure == 3) {
            circle();
        }else {
            System.out.println("Неверный ввод! Выберите 1, 2 или 3");
        }
    }

    public static void rectangle(){
        Scanner input = new Scanner(System.in);

        System.out.print("Сторона a: ");
        double a = input.nextDouble();
        System.out.print("Сторона b: ");
        double b = input.nextDouble();
        double s = a * b;
        String result = String.format("%.2f", s);
        System.out.println("Площадь : " + result);
    }

    public static void triangle(){
        Scanner input = new Scanner(System.in);

        System.out.print("Основание: ");
        double a = input.nextDouble();
        System.out.print("Высота : ");
        double h = input.nextDouble();
        double s = (a*h)/2;
        String result = String.format("%.2f", s );
        System.out.println("Площадь: " + result);
    }

    public static void circle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Диаметр: ");
        double d = input.nextDouble();
        double pi = Math.PI;
        double s = ((d*d)/4)*pi;
        String result = String.format("%.2f", s );
        System.out.println("Площадь: " + result);
    }
    }
