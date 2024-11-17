package Lesson4;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Выбор фигуры: \n1 - Треугольник \n2 - Прямоугольник \n3 - Круг \n=> " );
        int figure = input.nextInt();
        if (figure == 1){
            triangle();
        }else if (figure == 2) {
          rectangle();
        } else if (figure == 3) {
            circle();
        }else{
            System.out.println("Ошибка ввода!");
        }
    }

    public static void triangle (){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите стороны треугольника:");

        System.out.print("Сторона a: ");
        double a = input.nextDouble();
        System.out.print("Сторона b: ");
        double b = input.nextDouble();
        System.out.print("Сторона c: ");
        double c = input.nextDouble();
        double p = (a+b+c) / 2;
        double trng = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        String result = String.format("%.2f",trng);
        System.out.println(result);
    }

    public static void rectangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите стороны прямоугольника: ");

        System.out.print("Сторона a: ");
        double a = input.nextDouble();
        System.out.print("Сторона b: ");
        double b = input.nextDouble();
        double rctng = a*b;
        String result = String.format("%.2f",rctng);
        System.out.println(result);
    }

    public static void circle(){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус окружности: ");
       double rad = input.nextDouble();
       double pi = Math.PI;
       double crcl = pi * (rad*rad);
        String result = String.format("%.2f",crcl);
        System.out.println(result);

    }
}
