package ex_09_Switch;

public class Lab087_Interview_2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}

//prints match ASCII as ASCII value of A is 65
