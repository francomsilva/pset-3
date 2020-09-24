import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wage      : ");
        double wage = input.nextDouble();
        System.out.print("Monday    : ");
        int mondayHours = input.nextInt();
        System.out.print("Tuesday   : ");
        int tuesdayHours = input.nextInt();
        System.out.print("Wednesday : ");
        int wednesdayHours = input.nextInt();
        System.out.print("Thursday  : ");
        int thursdayHours = input.nextInt();
        System.out.print("Friday    : ");
        int fridayHours = input.nextInt();
        System.out.print("Saturday  : ");
        int saturdayHours = input.nextInt();
        System.out.print("Sunday    : ");
        int sundayHours = input.nextInt();
        int totalHours = (mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours);
        double weeklyGrossPay = wage * totalHours;

        System.out.printf("\n$%,.2f", weeklyGrossPay);
        System.out.print(".");
    }
}