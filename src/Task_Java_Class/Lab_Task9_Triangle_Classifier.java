package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task9_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side1: ");
        int side1 = sc.nextInt();


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

/*
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        // Real Logic will come
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene");
        }
 */