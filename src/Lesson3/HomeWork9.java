package Lesson3;
import java.lang.Math;
import java.util.Arrays;
public class HomeWork9 {
    public static void main(String[] args) {

        int[][] num = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length + 1; j++) {

                num[i][j] = num[i][j] * num[i][j];

                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}






