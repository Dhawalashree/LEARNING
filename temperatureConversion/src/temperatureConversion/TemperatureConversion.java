package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit\r\n"
				+ "\r\n"
				+ "2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:	
			System.out.println("Enter the temperature in Celsius:");
			double celsius = sc.nextDouble();
		    double farheneit = celsiusToFahrenheit(celsius);
		    System.out.println( celsius+ " °C is equivalent to " + farheneit + " °F");
		    break;
		case 2:	
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit = sc.nextDouble();
		    double celsius1 = fahrenheitToCelsius(fahrenheit);
		    System.out.println( fahrenheit+ " °F is equivalent to " + celsius1 + " °C");
		    break;
		default:
			System.out.println("Enter correct option");
		 }
		sc.close();
	}
		public static double celsiusToFahrenheit(double celsius)
	    { 
			return (celsius * 9/5) + 32; 
	    }
		public static double fahrenheitToCelsius(double fahrenheit)
		{ 
			return (fahrenheit - 32) * 5/9;
		}
}
	

