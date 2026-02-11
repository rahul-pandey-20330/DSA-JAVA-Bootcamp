// Find the Fibonici Number
import java.util.Scanner;
public class Fibnc // Fibonici means the result is addition of previous two number
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no to find its Fibonici Number : ");
int num = sc.nextInt();

int a = 0;   //initial numbers
int b = 1;   //initial numbers 	
int count = 2;
System.out.println(num + "th Fabonici series is : ");

while (count <= num){
	int temp = b;	//now temp = 1
	b = a+b;		//now b = 0 +1
	System.out.println(b );
	a = temp;		//now a = 1
	count++;
	
}
//System.out.println(num + "th Fabonici Number is : "+b);
}
}
