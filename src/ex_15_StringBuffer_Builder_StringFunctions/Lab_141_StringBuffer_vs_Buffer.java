package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_141_StringBuffer_vs_Buffer {
    public static void main(String[] args) {
        // String - 90% is used in Automation

        String s0 = "Sabitha";
        String s1 = new String("Sabitha");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Sabitha");
        StringBuilder stringBuilder = new StringBuilder("Sabitha");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
