import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again = 'y';

        while (again == 'y' || again == 'Y') {
            System.out.println("\n--- Java Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Power");
            System.out.println("7. Square Root");

            System.out.print("Choose an option (1-7): ");
            int choice = input.nextInt();

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            double num2;
            double result;

            switch (choice) {
                case 1:
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result = " + (num1 / num2));
                    }
                    break;

                case 5:
                    System.out.print("Enter percentage: ");
                    num2 = input.nextDouble();
                    System.out.println("Result = " + (num1 * num2 / 100));
                    break;

                case 6:
                    System.out.print("Enter power: ");
                    num2 = input.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 7:
                    if (num1 < 0) {
                        System.out.println("Error: Square root of negative number is not possible.");
                    } else {
                        System.out.println("Result = " + Math.sqrt(num1));
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next().charAt(0);
        }

        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}
