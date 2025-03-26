package ex_02_Java_Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_Task3_GradeCalculator {
    public static void main(String[] args) {
       // A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
        //int score=90;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Score: ");
        int score=sc.nextInt();

      char Grade = (score<=100 && score>=90)?'A':(score<90 && score>=80)?'B':
                (score<80 && score>=70)?'C':(score<70 && score>=60)?'E':'F';
        System.out.println("Your grade is "+Grade);

    }
}
