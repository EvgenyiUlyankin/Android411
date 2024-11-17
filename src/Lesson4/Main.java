package Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = 5.25f;
//        System.out.println(Math.round(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(4, 2));
//        System.out.println(Math.PI);
//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", 2*Math.PI*radius);

//        System.out.print("Katet 1: ");
//        int kat1 = input.nextInt();
//        System.out.print("Rfnrn 2");
//        int kat2 = input.nextInt();
//        System.out.printf("Gipotenuza : %1f", Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2)));


        /////////////////////         09.11.24          /////////////////////////////////

//        symbolDraw(9, '+', '-');
//        symbolDraw(9, 'X', '0');
//
//
//        }

//    public static void symbolDraw(int count, char a, char b){
//        for (int i = 0; i < count; i++) {
//            if(i%2 == 0)
//                System.out.print(a);
//            else System.out.print(b);
//
//        }
//        System.out.println();


//        int a = 30;
//        int b = 45;
//        System.out.println("Перед вызовом метода:\na = " + a + "\nb = " + b);
//        swapFunc(a, b);
//        System.out.println("Перед вызовом метода:\na = " + a + "\nb = " + b);
//        int a= 11;
//        int b = 6;
//        int c = min(a, b);
//        System.out.println("Минимальное значение: " + c);

//        int a = input.nextInt();
//        int b = input.nextInt();
//
        //  задачу прорешать !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }


//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n-1; i > 0; i--) {
//            printLine(1, i);
//        }

//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();

//        sum_str("Сумма 2х чисел: ", 20, 10);
//        sum_str("Сумма 3х чисел: ", 20, 10, 3);
//        sum_str("Сумма чисел: ");


//        find_num(2, 7, 0, 3, 1, 5, -13);
//        find_num(2, 7, 0, 3, 1, 5, -13, 13);
//        find_num(26);
//        find_num(99, 99, 100, 34, -39);
//        find_num(99, 39, 99, 100, 34);


        ////////////////////////////              10.11.24                  ///////////////////////////////

        ////___________________ Часть ДЗ________________________/////

//        System.out.println("1 прямоугольник, ...");
//int figure = input.nextInt();
//if (figure == 1){
//    rectangle();
//}else{
//    System.out.println("Ошибка ввода ");
//}

        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
        int[] num2 = {1, 2, 5};

        System.out.println(max(num1));
        System.out.println(max(num2));
//    public static void rectangle(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ширина");
//        float w = input.nextFloat();
//        System.out.println("Высота");
//        float h = input.nextFloat();
//        System.out.println("Площадь: %2f" + w * h);
//
    }

    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mx < mas[i]) {
                mx = mas[i];
            }
        }
        return mx;
    }

//    public static void find_num(int... v) {
//        int max = 0;
//        for (int j : v) {
//            if (j % 13 == 0 && j > 0) {
//                if (max < j)
//                    max = j;
//            }
//        }
//        System.out.println(max==0 ? "Число не найдено" : max);
//    }
//
//
//
//
//    public static void sum_str(String message, int... num){
//        int res = 0;
//        for (int i = 0; i < num.length; i++) {
//            res += num[i];
//        }
//        System.out.print(message);
//        System.out.println(res);
//    }
//
//
//    public static void sum(int...num){
//        int res = 0;
////        for (int n: num)
////            res += n;
//        for (int i = 0; i < num.length; i++) {
//            res += num[i];
//
//        }
//        System.out.println(res);
//    }
//
//
// public static void printLine(int start, int end){
//     for (int i = start; i <= end; i++) {
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }
//
//    public static int cub (int a){
//        return a * a * a;
//    }
//
//
//    public static int min(int n1, int n2){
//        int minCh;
//        if(n1>n2){
//            minCh = n2;
//        } else {minCh = n1;}
//        return minCh;
//    }
//
//
//    public static void swapFunc(int a, int b){
//        System.out.println("До замены: \na = " + a + "\nb = " + b);
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("После замены: \na = " + a + "\nb = " + b);
//    }
/////////////////////////////           10.11.24             /////////////////////////////////////////


    }
