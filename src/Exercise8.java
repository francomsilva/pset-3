import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Students : ");
        int students = input.nextInt();
        System.out.print("Teachers : ");
        int teachers = input.nextInt();
        System.out.print("Capacity : ");
        int capacity = input.nextInt();

        double totalPeople = students + teachers;
        double busesNeeded = (totalPeople + capacity - 1) / capacity;
        int overflow = (students + teachers) % capacity;

        System.out.println("\nBuses required      : " + (int) busesNeeded);
        System.out.println("Overflow passengers : " + overflow);
    }
}