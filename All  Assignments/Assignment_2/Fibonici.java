//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonici {
 public static void main(String []args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Number to know it's fibonici Number : ");
    int num = sc.nextInt();
    int count =2;
    int a = 0;
    int b =1;
    while (num>=count)
    {
        int temp =b;
        b = a + b;
        a =temp;
        count++;
    }
    System.out.println("Fibonici Number Of "+num + " IS : "+ b);
 }   
}
