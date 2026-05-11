//KeShay Sampson
    import java.util.Scanner;

public class Main {

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0, y = 0;
        boolean numbersEntered = false;
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1 - Enter two (2) numbers (x and y)");
            System.out.println("2 - Print all numbers between x and y");
            System.out.println("3 - Find the average of all numbers between x and y");
            System.out.println("4 - Find all prime numbers between x and y");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter x: ");
                    x = input.nextInt();
                    System.out.print("Enter y: ");
                    y = input.nextInt();
                    numbersEntered = true;
                    break;

                case 2:
                    if (!numbersEntered) {
                        System.out.println("Please enter x and y first (Option 1).");
                        break;
                    }
                    System.out.println("Numbers between " + x + " and " + y + ":");
                    for (int i = x; i <= y; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (!numbersEntered) {
                        System.out.println("Please enter x and y first (Option 1).");
                        break;
                    }
                    int sum = 0;
                    int count = 0;
                    for (int i = x; i <= y; i++) {
                        sum += i;
                        count++;
                    }
                    double avg = (double) sum / count;
                    System.out.println("Average of numbers between " + x + " and " + y + " = " + avg);
                    break;

                case 4:
                    if (!numbersEntered) {
                        System.out.println("Please enter x and y first (Option 1).");
                        break;
                    }
                    System.out.println("Prime numbers between " + x + " and " + y + ":");
                    for (int i = x; i <= y; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}

    

