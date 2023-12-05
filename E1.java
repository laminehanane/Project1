package Project1;

import java.util.Scanner;

public class E1 {
    //Create a program that uses an array to store a list of temperatures for a week,
    //and then uses a loop to find the highest and lowest temperature for the week.
    public static void main(String[] args) {
        // Initialize an array to store temperatures for a week (7 days)
        double[] temperatures = new double[7];
        Scanner scanner = new Scanner(System.in);
        // Prompt user to input temperatures for a week
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        // Find the highest and lowest temperatures
        double highestTemp = temperatures[0];
        double lowestTemp = temperatures[0];

         for (double temp : temperatures) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }
        // Display the highest and lowest temperatures
        System.out.println("Highest temperature for the week: " + highestTemp + "°C");
        System.out.println("Lowest temperature for the week: " + lowestTemp + "°C");

        scanner.close();
    }

}
