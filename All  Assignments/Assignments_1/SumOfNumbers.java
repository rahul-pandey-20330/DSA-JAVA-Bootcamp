//Take two numbers and print the sum of both.
import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number :");
		float num1 = sc.nextFloat();
		System.out.print("Enter Second Number :");
		float num2 = sc.nextFloat();
		float result = num1 + num2;
		System.out.print("Sum of Two Numbers is :"+result);
	}
}