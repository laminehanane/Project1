package Project1;

public class E7 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0;
        int second = 1;

        System.out.println("The first " + n + " numbers in the Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}