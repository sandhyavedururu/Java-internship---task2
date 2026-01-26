package task2;
import java.util.Scanner;
public class celsiustofehrenhiet {

	public static void main(String[] args) {
		double celsius=48.2;
		double fahrenheit=(celsius*9/5)+32;
		System.out.printf("[Fixed Value]%.2f°F=%.2f°C\n",fahrenheit,celsius);
		Scanner scanner =new Scanner(System.in);
		System.out.print("\nEnter temperature in Fahrenheit:");
		
		double  userFahrenheit= scanner.nextDouble();
		double userCelsius=(userFahrenheit-32)*5/9;
		System.out.printf("[User Input]%.2f°F=%.2f°C",userFahrenheit,userCelsius);

	 

	}

}

		