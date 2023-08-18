package bitwiseBitConverter;
import java.util.Scanner;

public class BitwiseConverter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int setBitsCount = countSetBits(num);

        System.out.println("Number of set bits: " + setBitsCount);

        scanner.close();
    }
    public static int countSetBits(int num) 
    {
        int count = 0;
        while (num > 0)
        {
            count += num & 1;
            num >>= 1; 
        }
        return count;
    }
}
