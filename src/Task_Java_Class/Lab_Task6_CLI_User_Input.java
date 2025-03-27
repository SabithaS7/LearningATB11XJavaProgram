package Task_Java_Class;

public class Lab_Task6_CLI_User_Input {
    public static void main(String[] args) {

       // System.out.println("Enter the Name, Age, Salary");
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        Double Salary = Double.parseDouble(args[2]);

        System.out.println("Name - " +Name);
        System.out.println("Age is "+age);
        System.out.println("Salary =  "+Salary);


    }
}
