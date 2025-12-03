import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=========================================");
        System.out.println("           ADVANCED CALCULATOR           ");
        System.out.println("=========================================");

        do {
            System.out.println("\nChoose an Operation:");
            System.out.println("-----------------------------------------");
            System.out.println("  1) Addition");
            System.out.println("  2) Subtraction");
            System.out.println("  3) Multiplication");
            System.out.println("  4) Division");
            System.out.println("  5) Power (x^y)");
            System.out.println("  6) Square Root");
            System.out.println("  7) Modulus (remainder)");
            System.out.println("  0) Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input, try again: ");
                sc.next();
            }
            choice = sc.nextInt();

            double num1 = 0, num2 = 0;

            if (choice >= 1 && choice <= 5 || choice == 7) {
                System.out.print("Enter first number: ");
                num1 = getValidNumber(sc);

                System.out.print("Enter second number: ");
                num2 = getValidNumber(sc);
            }

            switch (choice) {
                case 1:
                    printResult(num1, num2, num1 + num2, "+");
                    break;

                case 2:
                    printResult(num1, num2, num1 - num2, "-");
                    break;

                case 3:
                    printResult(num1, num2, num1 * num2, "*");
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        printResult(num1, num2, num1 / num2, "/");
                    }
                    break;

                case 5:
                    System.out.println("\nResult:");
                    System.out.println("------------------------------");
                    System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    System.out.println("------------------------------");
                    break;


                case 6:
                    System.out.print("Enter number for square root: ");
                    num1 = getValidNumber(sc);

                    if (num1 < 0) {
                        System.out.println("Error: Cannot take square root of a negative number!");
                    } else {
                        System.out.println("\nResult:");
                        System.out.println("------------------------------");
                        System.out.println("√" + num1 + " = " + Math.sqrt(num1));
                        System.out.println("------------------------------");
                    }
                    break;

                case 7:
                    printResult(num1, num2, num1 % num2, "%");
                    break;


                    



                case 0:
                    System.out.println("\nExiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 0);

        sc.close();
    }

    // method to handle nice output formatting
    public static void printResult(double a, double b, double result, String op) {
        System.out.println("\nResult:");
        System.out.println("------------------------------");
        System.out.println(a + " " + op + " " + b + " = " + result);
        System.out.println("------------------------------");
    }

    // method to safely read a number
    public static double getValidNumber(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid number, try again: ");
            sc.next();
        }
        return sc.nextDouble();
        
    }
}

