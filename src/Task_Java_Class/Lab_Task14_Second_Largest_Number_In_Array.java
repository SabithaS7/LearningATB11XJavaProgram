package Task_Java_Class;

public class Lab_Task14_Second_Largest_Number_In_Array {
    public static void main(String[] args) {
        int[] number = {27,38,46,57,92,108,66,74,82,60};
        int n1=0;
        int n2=0;
        for(int i=0;i<number.length;i++){
            if(number[i]>n1){
                n2=n1;
                n1=number[i];
            }
            if(number[i]>n2 && number[i]!=n1)
                n2=number[i];
        }
        System.out.println("Second Largest number is: "+n2);
    }
}
