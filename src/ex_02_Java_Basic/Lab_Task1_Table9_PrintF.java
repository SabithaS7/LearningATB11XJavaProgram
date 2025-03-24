package ex_02_Java_Basic;

public class Lab_Task1_Table9_PrintF {
    public static void main(String[] args) {
        int table = 9;
      System.out.printf("Table of %d\n",table);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        System.out.printf("%d x 1 = %d\n",table,table*1);
        System.out.printf("%d x 2 = %d\n",table,table*2);
        System.out.printf("%d x 3 = %d\n",table,table*3);
        System.out.printf("%d x 4 = %d\n",table,table*4);
        System.out.printf("%d x 5 = %d\n",table,table*5);
        System.out.printf("%d x 6 = %d\n",table,table*6);
        System.out.printf("%d x 7 = %d\n",table,table*7);
        System.out.printf("%d x 8 = %d\n",table,table*8);
        System.out.printf("%d x 9 = %d\n",table,table*9);
        System.out.printf("%d x 10 = %d",table,table*10);

    }
}
