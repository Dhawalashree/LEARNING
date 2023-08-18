package logicalOperator;

import java.util.Scanner;

public class LogicalOperatorValidator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean valid_input = sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean certain_condition = sc.nextBoolean();
		sc.close();
		boolean input = isValidInput(valid_input, certain_condition);
		if(input)
		{
			System.out.println("Input is valid.");
		}
		else
		{
			System.out.println("Input is not valid.");
		}
	}
	public static boolean isValidInput(boolean valid_input, boolean certain_condition)
	{
		return valid_input || certain_condition	;    
	}
}
