package string_joiner;

import java.util.Scanner;

public class StringJoiner 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		System.out.println("The combined string is "+joinStrings(str1, str2));
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+ "," +str2;
	}
}
