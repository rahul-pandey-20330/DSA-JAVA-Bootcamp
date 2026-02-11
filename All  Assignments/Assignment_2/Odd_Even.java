import java.util.Scanner;
public class Odd_Even {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
        if(num %2==0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}