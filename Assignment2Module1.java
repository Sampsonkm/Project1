//Ke'Shay Sampson Assignment 2
import java.util.Scanner; //Import the Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        int sub = number1 - number2;

        System.out.println("Your results are: ");
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);