package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task16_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= 2 * i - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

