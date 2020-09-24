import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Height : ");
        double height = input.nextDouble();
        System.out.print("Width  : ");
        double width = input.nextDouble();
        double perimeter = (height + width) * 2;
        double perimeterInCentimeters = perimeter * 2.54;

        System.out.printf("\n%,.2f", perimeterInCentimeters);
        System.out.print(" centimeters.");
    }
}