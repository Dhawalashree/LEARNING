package arithmetic_operations;

import java.util.Scanner;

public class Arithmetic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for num1 and num2 for performing arithmetic operations");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("Subtraction of num1 & num2 is:" +subtractNumbers(num1, num2));
		System.out.println("Multiplication of num1 & num2 is:" +multiplyNumbers(num1, num2));
		System.out.println("Division of num1 & num2 is:" +divideNumbers(num1, num2));
		System.out.println("Remainder of num1 & num2 is:" +findRemainder(num1, num2));
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
