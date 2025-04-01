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
        sc.close();
    }
}

/*
// madam -> madam, naman -> reveser(naman) ->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, I will check Palindrome");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }


    }

    private static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }

        return reversed;
    }

    private static String reverseStringSB(String userInput) {           //another way
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }
 */