package Task_Java_Class;

public class Lab_Task7_CLI_Max_Two_Numbers {
    public static void main(String[] args) {


        int Num1 = Integer.parseInt(args[0]);
        int Num2 = Integer.parseInt(args[1]);

        int Result= Num1>Num2 ? Num1 : Num2;
        System.out.println(Result+ " is the maximum of two numbers");





    }
}
