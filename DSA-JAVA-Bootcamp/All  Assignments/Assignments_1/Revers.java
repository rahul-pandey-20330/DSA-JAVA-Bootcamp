package Assignment_1;
import java.util.Scanner;
public class Revers
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number and get its reverse no. and cout its digit :");
        int num = input.nextInt();
        while (num>0)
        {
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;
            count++;
        }
        System.out.println("Reverse number is : "+sum+"\n total digit is : "+count);
    }
}
