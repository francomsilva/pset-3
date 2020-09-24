import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Salary  : ");
        double salary = input.nextDouble();
        System.out.print("401(k)  : ");
        double retirement = input.nextDouble();
        System.out.print("Federal : ");
        double federalTaxes = input.nextDouble();
        System.out.print("State   : ");
        double stateTaxes = input.nextDouble();

        double taxedIncome = (salary * ((100 - retirement) / 100));
        double federalTaxesCost = (taxedIncome * (federalTaxes / 100));
        double stateTaxesCost = (taxedIncome * (stateTaxes / 100));
        double finalSalary = (taxedIncome - federalTaxesCost - stateTaxesCost);
        double biweeklySalary = (finalSalary / 24);

        System.out.printf("\n$%,.2f", biweeklySalary);
        System.out.print(".");
    }
}