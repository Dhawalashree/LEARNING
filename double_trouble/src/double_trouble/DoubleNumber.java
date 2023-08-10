package double_trouble;

import java.util.Scanner;

public class DoubleNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be doubled");
		int num = sc.nextInt();
		sc.close();
		System.out.println("The doubled number is "+doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}
}
