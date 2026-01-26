package task2;
import java.util.Scanner;
public class MultipleConversations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter temperature in Celsius: ");
		    double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
		    System.out.println("Temperature in Fahrenheit:"+fahrenheit);
		    System.out.print("Convert another?(y/n):");
		    String choice = scanner.next();
		    if (!choice.equalsIgnoreCase("y")){
		    	break;
		            }
		        }

		        System.out.println("Program ended.");
		        scanner.close();
		    }
		
	
}
