package ex_05_TypeCasting;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 7586869584l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
