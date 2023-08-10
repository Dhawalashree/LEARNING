import java.util.Scanner;
package com.kodnest.questions;

public class StrJoiner 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		joinStrings(str1,str2);
		System.out.println(str1+ "," +str2);
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}

}
