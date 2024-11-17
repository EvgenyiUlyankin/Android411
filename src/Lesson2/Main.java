package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = input.nextInt();
//        System.out.println("Вы ввели число: " + num);
//        System.out.print("Введите имя: ");
//        String name = input.nextLine();
//        System.out.print("Введите возраст: ");
//        int age = input.nextInt();
//        System.out.print("Введите рост: ");
//        float height = input.nextFloat();

//        System.out.print("Возраст: ");
//        int age = input.nextInt();
//        input.nextLine();
//        System.out.print("Имя: ");
//        String name = input.nextLine();
//        System.out.println(name + " " + age);input.close();

//        System.out.print("Введите число 1: ");
//        int One1 = input.nextInt();
//        input.nextInt();
//
//        System.out.print("Введите число 2: ");
//        int Two2 = input.nextInt();
//        input.nextInt();
//
//        System.out.print("Введите число 3: ");
//        int Three3 = input.nextInt();
//        input.nextInt();
//
//        System.out.print("Введите число 1: ");
//        int Four4 = input.nextInt();
//        input.nextInt();
//
//        System.out.println(One1 + Two2 + Three3 + Four4);input.close();
//

//        int a = 5;
//        a +=10; //a=a+10
//        a-=2; //a = a-2
//        System.out.println(a);

//        int a, b, c, sum;
//        System.out.println("Введите первое число: ");
//        a = input.nextInt();
//        System.out.println("Введите второе число: ");
//        b = input.nextInt();
//        System.out.println("Введите третье число: ");
//        c = input.nextInt();
//        sum = a+ b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int sum;
//        System.out.println("Введите первое число: ");
//        sum = input.nextInt();
//        System.out.println("Введите второе число: ");
//        sum += input.nextInt();
//        System.out.println("Введите третье число: ");
//        sum += input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum); //пересмотрть урок и код

//        int a = 5;
//        int b = 3;
//        System.out.println( a==b);//true
//        System.out.println( a!=b);//false

//        boolean a1 = 5>6 || 4<6; //false/true
//        boolean a2 = 5>3;
//        System.out.println(a1);
//        System.out.println(!a2);

        /*
         if (условие){
            команда1
            } else {
                команда2
            }

         */


//        int age;
//        System.out.println("Введите свой возраст: ");
//        age = input.nextInt();
//        if (age >=18){
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать! ");
//        }
//         else {
//            System.out.println("Доступ запрещен");
//            System.out.println("Вход разрешен с 18 лет!");
//        }

//

//        int age = 25;
//        boolean isYoung = age >=18; //true
//        boolean isOld = age <=65 ; //false
//        if (isYoung && isOld){
//            System.out.println("Вы можете работать!");
//
//        } else {
//            System.out.println("Работать не обязательно");
//        }

//        int age = 5;
//        if (age < 18 || age > 65){
//            System.out.println("Вы можете работать!");
//        } else {
//            System.out.println("Работать не обязательно");
//        }


//        System.out.print("Введите сторону a: ");
//       int a = input.nextInt();
//        System.out.print("Введите сторону b: ");
//       int b = input.nextInt();
//        System.out.print("Введите сторону c: ");
//       int c = input.nextInt();
//        if (a == b && b == c && a == c){
//            System.out.println("Тругольник равностороний");
//        } else if { a =

        //ЗАДАЧА С ТРЕУГОЛЬНИКОМ ДОДЕЛАТЬ!!


//        int day, time;
//        System.out.println("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.println("Рабочий день.\n Введите время: ");
//            time = input.nextInt();
//            if (time >= 9 && time <= 18) {
//                System.out.println("Открыто");}
//            } else {
//                System.out.println("Закрыто!");
//            } else if (day == 6 || day == 7) {
//                System.out.println("Выходной день");
//            } else {
//                System.out.println("Такого дня недели не существует");
//            }
//

        // ДОДЕЛАТЬ! НАЙТИ ОШИБКУ!!!!!!

//        int n;
//        System.out.println("Введите количество ворон: ");
//        n = input.nextInt();
//        if (n>=0 && n<=9){
//            System.out.print("На ветке ");
//            if (n==1){
//                System.out.println(n + " ворона");
//            } else if (n>=2 && n<=4){
//                System.out.println(n + " вороны");
//            } else if (n>=5 && n <=9 || n ==0){
//                System.out.println(n+ " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        int n;
//        System.out.println();
//        n = input.nextInt();
//        System.out.println(n%10);
        //ПОДСКАЗКА К ЗАДАЧЕ С КОПЕЙКАМИ

//                int day;
//        System.out.println("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день - ");
//            if (day == 1 ) {
//                System.out.println("Понедельник");
//            } else if (day==2) {
//                System.out.println("Вторник");
//            }
//
//            } else if (day == 6 || day == 7) {
//                System.out.println("Выходной день");
//            } else {
//                System.out.println("Такого дня недели не существует");
//            } //ПЕРЕДЕЛАТЬ


//        int number, res;
//        number = -5;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);


//        int age;
//        System.out.print("Введите возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 && age <= ? "Приятного просмотра!" : "Вам еще рано смотреть этот фильм");
//

//        int a = 20, b = 10;
//        System.out.println(a==b ? "a==b" : a>b ? "a>b" : "b>a");

//        int n = true ? false ? 10:20:30;
//        System.out.println(n); //20

//        int a = 10, b = 2;
//        System.out.println(b==0 ? "На ноль делить нельзя" : (float) a/b); // int привели к float

//        int n;
//        System.out.println("\t Выбор цвета светофора\n1 (11) - красный, 2 (22)- желтый, 3 (33) - зеленый");
//        n=input.nextInt();
//        switch (n){
//            case 1:
//            case 11:
//                System.out.println("Stop");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Ready");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Go");
//                break;
//            default:
//                System.out.println("no colors");
//        }

//        int month; //месяц
//        int numDay = 0; //число дней
//        int year; // год
//
//        System.out.println("Введите месяц числом: ");
//        month = input.nextInt();
//
//        switch (month){
//
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDay = 31;
//                break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDay = 30;
//                break;
//
//            case 2:
//                System.out.println("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 ==0){
//                    numDay = 29;
//                } else {
//                    numDay = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не существует");
//
//        }
//        if (month>=1 && month<=12)
//        System.out.println("Количество дней: " + numDay);
//

//        int mounth;
//
//        System.out.println("Введите номер месяца: ");
//
//        mounth = input.nextInt();
//        switch (mounth){
//            case 1, 2, 12 -> System.out.println("Winter");
//            case 3, 4, 5 -> System.out.println("Spring");
//            case 6, 7, 8 -> System.out.println("Summer");
//            case 9, 10, 11 -> System.out.println("Autumn");
//            default -> System.out.println("no mounth");
//
//        }


//        int mounth;
//        System.out.println("Введите номер месяца: ");
//        mounth = input.nextInt();
//        String  s = switch (mounth){
//
//            case 1, 2, 12 -> "Winter";
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Autumn";
//            default -> "no mounth";
//        };
//        System.out.println(s);


//        System.out.println("Введите баллы по 12бальной шкале: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по пятибальной шкале: ");
//        switch ((num >= 1 && num <= 3) ? 2:
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("No meaning");
//        }

//        int i = 0; //переменная счетчик
//        while (i<5){ //условие
//            System.out.println(i);
//            i++; //шаг цикла
//        }

//        int i = 5; //переменная счетчик
//        while (i>0){ //условие
//            System.out.println(i);
//            i--; //шаг цикла
//        }


//        int i = 100; //переменная счетчик
//        while (i>0){ //условие
//            System.out.println(i);
//          //  i = i/5; //шаг цикла
//          //  i = i-10;
//            i = i-2;
//        }


//        int n, sum = 0;
//
//        System.out.println("Введите число: ");
//        while (input.hasNextInt()){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n; //sum = sum + n
//        }
//
//        System.out.println("Сумма веденных чисел: " + sum);

//        int start, finish, sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        start = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        finish = input.nextInt();
//        while (start <= finish){
//            if (start % 2 != 0)
//            sum += start;
//            start++;
//        }
//        System.out.print("Сумма нечетных чисел: " + sum);

//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//
//        } while (i > 5);


//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Ведите число: ");
//            num = input.nextInt();
//
//            if (num < 0) {
//                sum += num; // sum = sum + num
//                count++; // count = count + 1
//            }
//        } while (num != 0);
//        average = (float) sum/count;
//        System.out.printf("Среднее ариметическое отрицательнх чисел: %2f" + average);


        // ЗАДАЧА: ЧИСЛО ПАЛИНДРОМ

//        int number, copy, revers_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt(); // 321
//        copy = number; //321
//
//        do {
//
//            revers_number *= 10; // revers_number = revers_number*10 revers_number = 0*10 = 0
//            revers_number += copy%10; //revers_number = revers_number+copy%10; revers_number = 0+1 = 1
//            copy/=10; //32
//        }while (copy>0);
//        System.out.println("Число " + number + (number==revers_number ? " " : " не ") + "палиндром");


//        int i = 0;
//        while (i<10){
//            if (i==3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i==5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        int n;
//        while (true) {
//            System.out.println("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) {
//                break;
//            }
//        }

//        int n, proizv = 1;
//        while (true){
//            System.out.print("Введите число: ");
//            n=input.nextInt();
//            if (n == 0)
//                break;
//            if (proizv == 1){}
//            proizv*=n;
//        }System.out.println("Произведение чисел : "+proizv);input.close(); // ДОДЕЛАТЬ!!!

//        int n=0, proizv=0;
//        while (true){
//            System.out.print("Введите число: ");
//            n=input.nextInt();
//            if (n==0) break;
//            if (proizv==0) proizv++;
//            proizv*=n;
//        }System.out.println("Произведение чисел : "+proizv);input.close();

//        int i = 1;
//        while (i<5){
//            System.out.println("Внешний цикл i = " + i);
//            int j = 1;
//            while (j<4){
//                System.out.println("\tВнутренний цикл j = " + j);
//                j++; // j == 4
//            }
//
//            i++; // i == 2
//        }

        //26.10.24
        //ДОМАШНЕЕ ЗАДАНИЕ

//        int n, orient;
//        String symbol;
//        System.out.println("Кол-во символов: ");
//        n = input.nextInt();
//        System.out.println("Тип символа: ");
//        symbol = input.next();
//        System.out.println("0 - горизонт\n1 - вертикаль\n ориентация линии: ");
//        orient = input.nextInt();
//
//        for (int i = 0; i < n ; i++) {
//            if (orient ==1)
//            System.out.println(symbol);
//        } else {
//            System.out.println(symbol + " ");
//        }
        //доделать

//        int n;
//        System.out.print("Введите целое число: ");
//        n = input.nextInt();
//
//        for (int i = 1; i<=n ; i++) {
//            if(n % i == 0)
//            System.out.println(i + " ");
//        }

//        for (int i = 10; i < 100; i++) {
//            if (i / 10 == i % 10)
//            System.out.print(i + " ");
//
//        }

//        int a = 0;
//        for (int i = 5; i>0; i--, a++){
//            System.out.print("Шаг: " + a + "значение: ");
//            System.out.println(i);
//        }

        int w, h;
        System.out.print("Введите ширину: ");
        w = input.nextInt();
        System.out.print("Введите высоту: ");
        h = input.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j==0 || j==w-1)
                System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }    System.out.println();}

//        for (int i = 8; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }    System.out.println();}



    }
}
