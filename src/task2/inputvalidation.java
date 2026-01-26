package task2;
import java.util.Scanner;
public class inputvalidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double userFahrenheit = sc.nextDouble();
				if (userFahrenheit < -459.67) {
		            System.out.println("Invalid input: Absolute zero exceeded");
		        } else{
		        	double celsius= (userFahrenheit-32)*5/9;
		            System.out.println("Temperature in celsius: " + celsius);
		        }

		        sc.close();
    }
}

		        
