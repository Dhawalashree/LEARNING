package taxCalculator;

import java.util.Scanner;

public class CalculateTax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purchase_amount = sc.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double tax_rate = sc.nextDouble();
		sc.close();
		double total_cost = calculateTotalWithTax(purchase_amount, tax_rate);
		System.out.println("Total cost including tax: "+total_cost);
	}
	public static double calculateTotalWithTax(double purchase_amount, double tax_rate)
	{
		return purchase_amount + (purchase_amount*tax_rate);
	}

}
