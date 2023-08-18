package bitwiseSwap;
import java.util.Scanner;
public class BitwiseSwapper 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        swapUsingBitwise(first, second);

        System.out.println("After swapping: First = " + first + ", Second = " + second);

        scanner.close();
	}
	public static void swapUsingBitwise(int first, int second) 
	{
        int temp = first;
        first = first ^ second;
        second = temp ^ second;
        first = first ^ second;
    }

}
