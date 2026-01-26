package task2;

import java.util.Scanner;
   public class kelvinconvesation {

	    public static void main(String[] args) {
	        double fahrenheit =25;
	        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

	        System.out.printf("Fixed Value: %.2f°F = %.2fK%n", fahrenheit, kelvin);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("\nEnter temperature in Fahrenheit: ");
	        double userFahrenheit = scanner.nextDouble();

	        double userKelvin = (userFahrenheit - 32) * 5 / 9 + 273.15;
	        System.out.printf("User Input: %.2f°F = %.2fK%n", userFahrenheit, userKelvin);

	        scanner.close();
	    }
}
 
