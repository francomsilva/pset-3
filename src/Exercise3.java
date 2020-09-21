import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Height : ");
        double height = input.nextDouble();
        System.out.print("Width  : ");
        double width = input.nextDouble();
        double area = height * width;
        double areaInSquareMillimeters = area * 645.16;

        System.out.printf("\n%,.2f", areaInSquareMillimeters);
        System.out.print(" square millimeters.");
    }
}