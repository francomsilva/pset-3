import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount   : ");
        double amountConverted = input.nextDouble();

        int amount = (int) (amountConverted * 100);

        int quarters = (amount/25);
        amount = amount % 25;

        int dimes = (amount/10);
        amount = amount % 10;

        int nickles = (amount / 5);
        amount = amount % 5;

        int pennies = amount;

        System.out.println("\nQuarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickles);
        System.out.println("Pennies  : " + pennies);
    }
}