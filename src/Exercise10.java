import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (double) 5 / 9 * (fahrenheit - 32);
        double kelvin = celsius + 273.15;

        System.out.printf("\nCelsius    : %,.2f", celsius);
        System.out.printf("\nKelvin     : %,.2f", kelvin);
    }
}
