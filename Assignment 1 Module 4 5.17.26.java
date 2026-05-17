
public class Main {

    // ONE parameter → print numbers from 1 to n
    public static void multiUse(int n) {
        System.out.println("Printing numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // TWO parameters → find the average
    public static void multiUse(int a, int b) {
        double avg = (a + b) / 2.0;
        System.out.println("The average of " + a + " and " + b + " is: " + avg);
    }

    // THREE parameters → find the maximum
    public static void multiUse(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }

    public static void main(String[] args) {
        // Test calls
        multiUse(5);          // prints 1–5
        multiUse(10, 20);     // prints average
        multiUse(3, 9, 7);    // prints max
    }
}
