import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        int homeworkGradeOne = input.nextInt();
        System.out.print("Homework 2 : ");
        int homeworkGradeTwo = input.nextInt();
        System.out.print("Homework 3 : ");
        int homeworkGradeThree = input.nextInt();
        System.out.print("Quiz 1     : ");
        int quizGradeOne = input.nextInt();
        System.out.print("Quiz 2     : ");
        int quizGradeTwo = input.nextInt();
        System.out.print("Test 1     : ");
        int testGrade = input.nextInt();

        double homeworkAvg = (double) (homeworkGradeOne + homeworkGradeTwo + homeworkGradeThree) / 3;
        double quizAvg = (double) (quizGradeOne + quizGradeTwo) / 2;
        double markingPeriodGrade = (homeworkAvg * .15) + (quizAvg * .35) + (testGrade * .5);

        System.out.printf("\n%,.2f", markingPeriodGrade);
        System.out.print("%.");
    }
}