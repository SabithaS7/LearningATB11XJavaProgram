package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task10_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        int F1=0,F2=1,sum;
        System.out.print("Fibonacci Series is: " +F1+ " " +F2);  //" " is for space between the numbers
        for(int i =0;i<num-2;i++){
            sum=F1+F2;
            System.out.print(" "+sum);
            F1=F2;
            F2=sum;

        sc.close();


        }

    }
}
