package temperature_converter;

import java.util.Scanner;

public class TemperatureConverterApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for fahrenheit");
		double fahrenheit = sc.nextDouble();
		sc.close();
		TemperatureConverter temperatureconverter = new TemperatureConverter();
		System.out.println("Converted celsius is: "+temperatureconverter.convertFahrenheitToCelsius(fahrenheit));
	}
}
