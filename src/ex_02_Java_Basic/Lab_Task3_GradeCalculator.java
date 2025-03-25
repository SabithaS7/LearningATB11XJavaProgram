package ex_02_Java_Basic;

public class Lab_Task3_GradeCalculator {
    public static void main(String[] args) {
        int score=90;
        char Grade = (score<=100 && score>=90)?'A':(score<90 && score>=80)?'B':
                (score<80 && score>=70)?'C':(score<70 && score>=60)?'E':'F';
        System.out.println("Your grade is "+Grade);
    }
}
