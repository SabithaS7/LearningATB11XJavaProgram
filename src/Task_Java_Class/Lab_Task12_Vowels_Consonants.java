package Task_Java_Class;

import java.util.Scanner;

public class Lab_Task12_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String St = sc.next();
        int Vowel=0, Constant=0;
        St = St.toLowerCase();

        for(int i=0; i<St.length(); i++)
        {
        char ch = St.charAt(i);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            Vowel++;
        }
        else
        {
            Constant++;
        }

        }

        System.out.println("Number of Vowels in the String:  " +Vowel);
        System.out.println("Number of Consonants:  " +Constant);

    }
}
