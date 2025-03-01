// Find repeated digit in any number
import java.util.Scanner;
public class Count
{
    public static void main(String []args)
    {
        int num = 13839;
        int count = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem == 3)
            {
               count++;
            }
           num = num/10;
        }
        System.out.println(count);
    }
}
