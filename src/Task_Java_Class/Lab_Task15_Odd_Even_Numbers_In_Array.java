package Task_Java_Class;

public class Lab_Task15_Odd_Even_Numbers_In_Array {
    public static void main(String[] args) {
        int[] array = {13,88,76,45,99,27,42,30,8,22};
        for (int Num : array){
            if(Num%2==0)
                System.out.println("Even Number - "+Num);
            if(Num%2!=0)
                System.out.println("Odd Number - "+Num);
    }
}
    }

