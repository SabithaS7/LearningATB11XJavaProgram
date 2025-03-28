package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task13_Palindrome_Or_Not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        str = str.toLowerCase();
        String revstr = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            revstr = revstr + str.charAt(i);
        }

        if(str.equals(revstr))
        {
            System.out.println(str+ " is a Palindrome");
        }
        else
        {
           System.out.println(str+ " is not a Palindrome");
        }
    }
}
