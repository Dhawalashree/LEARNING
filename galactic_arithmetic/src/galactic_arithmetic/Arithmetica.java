package galactic_arithmetic;

import java.util.Scanner;

public class Arithmetica 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2 value to perform addition");
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		sc.close();
		System.out.println(galacticAddition(num1, num2));
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
