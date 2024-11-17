package Lesson3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        //МАССИВЫ
//
////        int mas[] = new int[]{2,3,5,3};
//////        int [] mas2 = new int[5];
//////
//////        int mas3[];
//////        mas3 = new int[4];
////        int mas[] = {2,3,5,3};
////        int mas[] = new int[4];
////        mas[0] = 5;
////        mas[1] = 2;
////        mas[2] = 7;
////        mas[3] = mas[1] + mas[2];
////
//////        System.out.println(mas[0]);
//////        System.out.println(mas[1]);
//////        System.out.println(mas[2]);
//////        System.out.println(mas[3]);
//////        System.out.println(mas.length);
//////
//////        int last = mas[mas.length - 1];
//////        System.out.println(last);
////
////        for (int i = 0; i < mas.length; i++) {
////            System.out.println(mas[i]);
////        }
//
////        int n = 10;
////        int [] mas = new int [n];
////        System.out.println(mas.length);
////        mas [n-1] = 2;// mas[9] = 2
////        mas [n-2] = 3;// mas[8] = 3
////        mas[n/5] = mas[n-1] + mas [n-2];
////        for (int i = 0; i < mas.length; i++) {
////            System.out.print(mas[i] + " ");
////
////        }
////
//        // 27.10.24 МАССИВЫ
//
////        int[] array = {1, 4, 6, 3, 8};
////        System.out.println(array);
////        System.out.println(Arrays.toString(array));
//
////
////        int n, sum = 0;
////        System.out.print("n = ");
////        n = input.nextInt();
////        int[]array = new int[n];
////
////        for (int i = 0; i<array.length; i++) {
////
////            System.out.print("->");
////            array [i] = input.nextInt();
////        }
////        System.out.println(Arrays.toString(array));
////
////        for (int i = 0; i < array.length; i++) {
////            if (array[i] < 0){
////                sum += array[i]; //sum = sum +array[i]
////            }
////        }
////
////        System.out.println("Сумма отрицательных элементов массива: " + sum);
//
////        int min;
////        int [] array = new int[5];
////        for (int i = 0; i < array.length; i++) {
////            System.out.print("-> ");
////            array[i] = input.nextInt();
////        }
////        System.out.println(Arrays.toString(array));
////        min = array[0]; //min = 9
////
////        for (int i = 0; i < array.length; i++) {
////            if (array[i]<min){
////                min = array[i];
////
////            }
////        }
////
////        System.out.println("Минимальный элемент в массиве: " + min);
//
////        int a = (int) (Math.random() * 7 )-2;
////        System.out.println(a);
//
//
////        int[] array = new int[10];
////        for (int i = 0; i < array.length; i++) {
////
////            array[i] = (int) (Math.random()*12+2); //[2;14)
////
////        }
////        System.out.println(Arrays.toString(array));
//
//
////        int[] array = new int[30];
////        for (int i = 0; i < array.length; i++) {
////
////            array[i] = (int) (Math.random()*31-15); //[-15;16)
////
////        }
////        System.out.println(Arrays.toString(array));
//
////        int[] array = new int[20];
////        for (int i = 0; i < array.length; i++) {
////
////            array[i] = (int) (Math.random()*40+10);
////
////        }
////        System.out.println(Arrays.toString(array));
//
////        int num = 0;
////        int sum = 0;
////        int[] array = new int[20];
////        for (int i = 0; i < array.length; i++) {
////            array[i] = (int) (Math.random() * 40 +10);
////        }for (int i = 0; i < array.length; i++) {
////            if(array[i] % 2 == 0){
////                num++;    }else {
////                sum = sum + array[i];
////            }
////        }
////        System.out.println(Arrays.toString(array));
////        System.out.println("Кол-во: " + num);
////        System.out.println("Сумма: " + sum);
//
//
////        int[] numbers = {10, 20, 30, 40, 50};
////        for (int i = 0; i < numbers.length; i++) {
////
////            System.out.print(numbers[i] + " ");
////
////        }
////        System.out.println();
////
////        for(int x : numbers){
////            System.out.print(x + " ");
////        }
////
////        String[] names = {"Oleg", "Ivan", "Dima", "Yolya"};
////        for (String name : names){
////            System.out.print(name + "\t");
////        }
//
//        /////////////    02.11.24
//
//        //ДОМАШНЯЯ РАБОТА ПОСМОТРЕТЬ!!!! ДОДЕЛАТЬ!!!!!
////        System.out.print("Введите начало сообщения: ");
////            int k = input.nextInt(); //5
////        System.out.print("Введите конец диапазона: ");
////        int n = input.nextInt(); //10
////        int[] array = new int[n - k + 1];
////
////
////        for (int i = 0, j = k ; i <= n - k; i++, j++) {
////            array[i] = j;
////            System.out.print(array[i]+"\t");
////        }
////        System.out.println("\n" + Arrays.toString(array));
//
//
//        //ЗАДАЧА С ТРЕУГОЛЬНИКОМ
//
////        int h = 7;
////        int w = h * 2 - 1; // 13
////        int m = w/2; // 6
////        for (int i = 0, l = m, r = m; i < h; i++, l--, r++) { //l = 6, j = 7, r = 6
////            for (int j = 0; j < w; j++) {
////                if (j>=l && j<=r)
////                System.out.print("*");
////                else
////                    System.out.print(" ");
////            }
////            System.out.println();
////        }
//
////        String[] cities = {"Bryansk", "Irkutsk", "Vladivostok", "Armavir"};
////        String [] cities2 = new String[cities.length + 1];
////
////        for (int i = 0; i < cities.length; i++) {
////            cities2[i] = cities[i];
////        }
////
////        cities2[cities.length] = "Krasnoyarsk";
////
////        System.out.println(Arrays.toString(cities));
////        System.out.println(Arrays.toString(cities2));
////
//
//        //               ArrayList
//
////        ArrayList<String>cities = new ArrayList<>();
////        cities.add("Bryansk");
////        cities.add("Irkutsk");
////        cities.add("Vladivostok");
////        cities.add("Armavir");
////        cities.add(1,"Krasnoyarsk");
////        System.out.println(cities);
////        System.out.println(cities.get(2)); //cities[2]
////        cities.set(2, "Kursk");  //cities[2] = "Kursk"
////        System.out.println(cities.size());
////
////
////        cities.remove(1);
////        cities.remove("Vladivostok");
//
////        for(String city:cities){
////            System.out.print(city + "\t");
////        }
//
////        for (int i = 0; i < cities.size(); i++) {
////            System.out.print(cities.get(i) + "\t");
////
////        }
//
////        System.out.println("\n" + cities.indexOf("Vladivostok"));
////        if (cities.contains("Kursk")) {
////            System.out.println(cities.contains("ArrayList содержит Kursk"));
////        }
//
//
////        int n, k;
////        ArrayList<Integer> mas = new ArrayList<>();
////        System.out.print("Введите элементы списка: ");
////        while ((n = input.nextInt()) > 0){
////            mas.add(n);
////        }
////        System.out.println(mas);
////        System.out.print("Введите индекс: ");
////        k = input.nextInt();
////
////        mas.remove(k);
////        System.out.print(mas);
//
////        int max, ind;
////        ArrayList<Integer> mas = new ArrayList<>();
////        for (int i = 0; i < 10; i++) {
////            mas.add((int) (Math.random() * 100));
////        }
////        for (int m : mas){
////            System.out.print(m + "\t");
////        }
////        max = mas.get(0);
////        for (int i = 0; i < 10; i++) {
////            if(mas.get(i) > max){
////                max = mas.get(i);
////            }
////        }
////        System.out.println("\nMax: " + max );
//////        ind = mas.indexOf(max); //индекс максимального элемента
//////        mas.remove(ind);
////        mas.remove(mas.indexOf(max));
////        mas.add(0, max);
////        for (int m:mas) {
////            System.out.print(m + "\t");
////
////        }
//
////
////        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
////        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11,21,33, 44, 55));
////        ArrayList<Integer> c = new ArrayList<>(Arrays.asList());
////
////        for (int i = 0; i < a.size(); i++) {
////            if(i<a.size()){
////                c.add(a.get(i));
////            }
////            if(i<b.size())
////            c.add(b.get(i));
////
////        }                           ///// ЗАПУТАЛСЯ! ПЕРЕСМОТРЕТЬ!!!! 2:58:00 и доделать
////
////        System.out.println(c);
//
//
//        //ДВУМЕРНЫЕ МАССИВЫ (МАТРИЦЫ) не меняют свою длинну
//
////        int[][] num = {
////                      {0, 1, 2, 3},
////                      {4, 5, 6, 7},
////                      {8, 9, 10, 11}
////        };
////        System.out.println(num[1][3]);
////        for (int i = 0; i < num.length; i++) {
////
////            System.out.println(Arrays.toString(num[i]));
////
////        }
////
////        for (int i = 0; i < num.length; i++) {
////            for (int j = 0; j < num[i].length; j++) {
////                System.out.print(num[i][j] + "\t");
////
////            }
////            System.out.println();
////        }


////////////////                  03.11.24          ///////////////////////////////////////////////////////////////////


//      int n = 5;     //    Вывести * определеннным образом
//      char [][] graph = new char [n][n];
////        for (int i = 0; i < graph.length; i++) {
////            System.out.println(Arrays.toString(graph[i]));
////        }
//        for (int i = 0; i <graph.length ; i++) {
//            for (int j = 0; j <graph[i].length ; j++) {
//                graph[i][j] = '*';
//            }
//        }
//        for (int i = 0; i <graph.length ; i++) {
//            for (int j = 0; j <graph[i].length ; j++) {
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();
//        }


//    int n = 4, m = 3, count = 0;  //   Посчитать кол-во отрицательных чисел
//    int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31) - 20;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//                if (mas[i][j]<0) {
//                    count ++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);


//        int a = 3,  b = 5;    //   Посчитать минимальную сумму в одной из строк массива
//        int one = 0;
//        int two = 0;
//        int three = 0;
//
//        int [][] mas = new int[a][b];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas [i][j] = (int)(Math.random() * 100);
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                if (i==0) {
//                one += mas[i][j];
//            } else if (i == 1){
//                    two+= mas[i][j];
//                }
//                else
//                {
//                    three+=mas[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов 1 строки: " + one);
//        System.out.println("Сумма элементов 2 строки: " + two);
//        System.out.println("Сумма элементов 3 строки: " + three);
//        if (three > one && one < two){
//            System.out.println("Строка с минимальной суммой элементов " + one + ", имеет номер 1");
//        } else if (three > two && two < one){
//            System.out.println("Строка с минимальной суммой элементов " + two + ", имеет номер 2");
//        } else {
//            System.out.println("Строка с минимальной суммой элементов " + three+ ", имеет номер 3");
//        }
//    }


//                     //_______________________ЗУБЧАТЫЙ МАССИВ_________________________//


//int[][] mas = new int[3][];
//mas[0] = new int[2];
//mas[1] = new int[3];
//mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("-> ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};

//        int[][] mas = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        int[][] mas = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }




    }
}