package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task8_Even_Or_Odd_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();


        if(number%2==0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }

        sc.close(); //need to close the scanner as well


    }
}
