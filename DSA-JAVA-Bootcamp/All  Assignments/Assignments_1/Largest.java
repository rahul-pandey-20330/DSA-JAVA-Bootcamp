// input three number and find largest
import java.util.Scanner;
public class Largest
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter First Number : ");
	int num1 = sc.nextInt();
	System.out.print("Enter Second Number : ");
	int num2 = sc.nextInt();
	
	System.out.print("Enter Third Number : ");
	int num3 = sc.nextInt();
	int max = num1;	//Assum that first number is largest number
	
	
	if(num2 > max && num3<=max)
	{
	
			max = num2; //Now new largest number is num2 placed in max variable
			System.out.print("Largest Number is : "+max +"\n");
	}
	else if(num3 > max)
	{
		max = num3; //now largest number is num3 placed in max variable
		System.out.print("Largest Number is : "+max);
	}
	else 
	{
		
		System.out.print("All are equal number : "+max);
		
	}
	
	
}
}