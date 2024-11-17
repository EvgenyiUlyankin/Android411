package Lesson1;

public class Main {
    public static void main(String[] args) {
//        float a = 8.5f;
//        double b = 8.5;
//        System.out.println(a);
//        System.out.println(b);

//        int a  = 1;
//        int b = 2;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        System.out.println("a = " + a);//1
//        System.out.println("b = " + b);//2

//      System.out.println("Hello \n\"World!!!\"");
//      System.out.println("Путь к каталогу D:\\folder\\file.txt");/

//        System.out.print("5 + 3 =");
//        System.out.println(5 + 3);
//        int a = 5;
//        int b = 3;
//        System.out.printf("a = %d; b = %d", a, b); // %d - для целочисленных значений
//        // для вещественных чисел и чисел с плавающей точкой - %f
//        // %c - для вывода одиносного символа
//        // %s - для вывода строковых значений
//
//        String name = "Евгений";
//        int age = 38;
//        float height = 1.65f;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f%n", name, age, height);
//        System.out.printf("%8d%n", 123); //_____123
//        System.out.printf("%4d%5d%n", 123, 456);// _123__456
//        System.out.printf("%4d%n", 123456789);// 123456789
//        System.out.printf("%8.2f%n", 123.4567);// __123.45
//        System.out.printf("%-6s%5d%n","num =", 456); // num =___456

//        System.out.printf("--------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES      %n");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s | %n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s | %04d | %n", "boolean", "boolean", 1);
//        System.out.printf("--------------------------------%n");


//        int num = 4321;
//        int a, b, c, d;
//        int res;
//        System.out.println("Исходное число" + num);
//        a = num%10;
//        System.out.println("a: " + a);
//        num = num/10;
//        System.out.println("num:" + num);
//        b = num%10;
//        System.out.println("b :" + b);
//        num = num/10;
//        c = num%10;
//        System.out.println("c :" + c);
//        num = num/10;
//        d = num%10;
//        System.out.println("d :" + d);
//        res = a*1000 + b*100 + c*10 + d;
//        System.out.println(res);


        //унарные операторы
        // ++инкремент  --декремент
        //Префиксная форма:
//        int a = 8;
//        a++;
//        System.out.println(a); //9
//        int a = 8;
//        a--;
//        System.out.println(a); //7

//        int a = 8;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 8;
//        int b = ++a;
//        System.out.println(a);
//        System.out.println(b);


//        int a= 1;
//        int b=1;
//        int c = a++ + 3;
//        int d = ++b + 3;
//        System.out.println(a);//2
//        System.out.println(b);//2
//        System.out.println(c);//4
//        System.out.println(d);//5

//        int a= 1;
//        int b=1;
//        int c = a++ + 3;
//        int d = ++b + 3;
//        System.out.println(a);//2
//        System.out.println(b);//2
//        System.out.println(c);//4
//        System.out.println(d);//5

//        int x = 5;
//        byte y = (byte) x;
//        System.out.println(y);

//        byte x = 5;
//        int y = (byte) x;
//        System.out.println(y);

//        int x = 7654321;
//        float y = x;
//        System.out.println(y);

//        long x = 5;
//        int y = (int) x;
//        System.out.println(y);

//        double x = 18.9845;
//        int y = (int) x;
//        System.out.println(y);//18

//        double x = 18.9845;
//        int y = (int)Math.round(x) ;
//        System.out.println(y); //19

//
//        int a = 5;
//        int b = 4;
//        int c = 7;
//
//        int sum = a+b+c;

//        System.out.println(sum);
//        System.out.println(a*b*c);
//        System.out.println((double) sum / 3);
//        System.out.printf("Среднее арифметическое = %2f", (double)sum/3);


//        int a = 5;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println(c);

        int d = 'a' + 3; // 92 + 3
        System.out.println(d);



    }
}