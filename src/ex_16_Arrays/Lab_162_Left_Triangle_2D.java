package ex_16_Arrays;

public class Lab_162_Left_Triangle_2D {
    public static void main(String[] args) {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
