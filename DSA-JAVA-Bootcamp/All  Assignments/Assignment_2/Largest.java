//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.print(num1 + " is Largest");
        }
        else if(num2 > num1 )
        {
            System.out.print(num2+" is Largest ");
        }
        else
        {
            System.out.print("Both Are Equal");
        }
    }
}
