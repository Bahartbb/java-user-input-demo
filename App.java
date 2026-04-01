import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your family name:");
        String familyName = scanner.nextLine();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        System.out.println("Please enter your grade:");
        float grade = scanner.nextFloat();

        System.out.println("Please enter your math point:");
        double mathPoint = scanner.nextDouble();

        System.out.println("Please enter your postal code:");
        long postalCode = scanner.nextLong();

        System.out.println("Are you an active student? (true/false):");
        boolean isStudent = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("Please enter your birth date:");
        String birthDate = scanner.nextLine();

        System.out.println("Please enter the first letter of your name:");
        char firstLetter = scanner.next().charAt(0);

        System.out.println();
        System.out.println("----- User Data -----");
        System.out.println("Name: " + name);
        System.out.println("Family name: " + familyName);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Math point: " + mathPoint);
        System.out.println("Postal code: " + postalCode);
        System.out.println("Active student: " + isStudent);
        System.out.println("Birth date: " + birthDate);
        System.out.println("First letter: " + firstLetter);

        scanner.close();
    }
}