package Task_Java_Class;

public class Lab_Task4_Increment_Decrement_Operator_1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        /* A-> ++a->EXP A->11, a=11
           +
           B->a++->EXP B->11, a=12
           +
           C->a++->EXP C->12, a=13
           11+11+12=34, a=13 */
    }
}
