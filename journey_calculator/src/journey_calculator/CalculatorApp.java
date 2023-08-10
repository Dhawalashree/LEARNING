package journey_calculator;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for speed");
		double speed = sc.nextDouble();
		System.out.println("Enter value for time");
		double time = sc.nextDouble();
		sc.close();
		JourneyCalculator journeycalculator = new JourneyCalculator();
		System.out.println("Distance is: "+journeycalculator.calculateDistance(speed, time));
	}

}
