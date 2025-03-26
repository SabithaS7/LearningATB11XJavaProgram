package Task_Java_Class;

public class Lab_Task5_Increment_Decrement_Operator_2 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);


        /* A->--a ->EXP A->19, a=19
           +
           B->a++ ->EXP B->19, a=20
           +
           C->a-- ->EXP C->20, a=19
           19+19+20=58 a=19 */
    }
}
