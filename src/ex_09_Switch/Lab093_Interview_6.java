package ex_09_Switch;

public class Lab093_Interview_6 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1) {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
//case -1 gets printed
