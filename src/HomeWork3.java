import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int num = input.nextInt();

        int res = num;

        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num % 10;
        num = num / 10;
        int d = num % 10;
        num = num / 10;
        int e = num % 10;

        int mult = a*b*c*d*e;
        float arith = (a+b+c+d+e)/5f;

        System.out.println("Произведение цифр числа " + res + ": " + mult);
        System.out.println("Среднее арифметическое числа " + res + ": " + arith);

        input.close();


    }

}
