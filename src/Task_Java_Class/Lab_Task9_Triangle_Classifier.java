package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task9_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side1: ");
        int side1 = sc.nextInt();


//        int side1 = 0;
//
//        if (sc.hasNextInt())
//        {
//            side1 = sc.nextInt();
//        }
//
//        else
//        {
//            System.out.println("Enter only the values ");
//            System.exit(0);
//        }


        System.out.print("Enter the length of side2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the length of side3: ");
        int side3 = sc.nextInt();




        if(side1 == side2 && side2 == side3 && side1 == side3)
        {
            System.out.println("The triangle is equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("The triangle is Isosceles");

        }
        else
        {
            System.out.println("The triangle is Scalene");

        }

        sc.close();
    }
}
