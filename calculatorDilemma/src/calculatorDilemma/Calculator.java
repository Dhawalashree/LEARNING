package calculatorDilemma;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a");
		float a = sc.nextFloat();
		System.out.println("Enter the value for b");
		float b = sc.nextFloat();
		System.out.println("Choose the operation you want to perform: +, -, *, / or %");
		String operator = sc.next();
		sc.close();
		calculator(a,b,operator);
	}
	public static void calculator(float a, float b, String operator)
	{
		float res;
		switch(operator)
		{
		case "+":
			res = a + b;
		    System.out.println("The result of the operator " + operator + " is " +res);
		    break;
		 
		case "-":
			res = a - b;
    	    System.out.println("The result of the operator " + operator + " is " +res);
		    break;
		
		case "*":
			 res = a * b;
			 System.out.println("The result of the operator " + operator + " is " +res);
			 break;
			 
		case "/":
			res = a / b;	 
			System.out.println("The result of the operator " + operator + " is " +res);
			break;
			
		case "%":
			res = a % b;
			System.out.println("The result of the operator " + operator + " is " +res);
			break;
		
		default:
			System.out.println("Enter correct operator");
		 
		}
	}
}
