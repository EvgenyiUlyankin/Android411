package Lesson2;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, m; String s;
        System.out.print("Введите число: ");
             n = input.nextInt();
        System.out.print("Введите символ: ");
             s = input.next();
        System.out.print("Для горизонтального вывода нажмите 0, для вертикального 1: ");
        m = input.nextInt();
        for (int i=0; i<n; i++){

//            if (m==0)
//                System.out.print(s);
//            else {
//                System.out.println(s);

            System.out.print(m==0 ? s : "\n" + s );
            }
        }

    }

